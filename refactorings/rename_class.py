from antlr4 import *
from antlr4.TokenStreamRewriter import TokenStreamRewriter

from refactorings.gen.Java9_v2Parser import Java9_v2Parser
from refactorings.gen.Java9_v2Listener import Java9_v2Listener


class RenameClassRefactoringListener(Java9_v2Listener):
    """
    To implement the encapsulate filed refactored
    Encapsulate field: Make a public field private and provide accessors
    """

    def __init__(self,
                 common_token_stream: CommonTokenStream = None,
                 class_new_name: str = None,
                 class_identifier: str = None,
                 package_identifier: str = None):
        """
        :param common_token_stream:
        """
        self.token_stream = common_token_stream
        self.class_new_name = class_new_name
        self.class_identifier = class_identifier
        self.package_identifier = package_identifier
        self.declared_objects_names = []

        self.is_package_imported = False
        self.in_selected_package = False
        self.in_selected_class = False
        self.in_some_package = False

        # Move all the tokens in the source code in a buffer, token_stream_rewriter.
        if common_token_stream is not None:
            self.token_stream_rewriter = TokenStreamRewriter(common_token_stream)
        else:
            raise TypeError('common_token_stream is None')

    def enterPackageName1(self, ctx:Java9_v2Parser.PackageName1Context):
        self.in_some_package = True
        if self.package_identifier is not None:
            if self.package_identifier == ctx.identifier().getText():
                self.in_selected_package = True
                print("Package Found")

    def enterNormalClassDeclaration(self, ctx:Java9_v2Parser.NormalClassDeclarationContext):
        if self.package_identifier is None \
                and not self.in_some_package \
                or self.package_identifier is not None \
                and self.in_selected_package:
            if ctx.identifier().getText() == self.class_identifier:
                print("Class Found")
                self.in_selected_class = True
                self.token_stream_rewriter.replaceIndex(
                    index=ctx.identifier().start.tokenIndex,
                    text=self.class_new_name)

    def enterSingleTypeImportDeclaration(self, ctx:Java9_v2Parser.SingleTypeImportDeclarationContext):
        if self.package_identifier is not None:
            if self.package_identifier == ctx.typeName().getText():
                self.is_package_imported = True

    def enterTypeImportOnDemandDeclaration(self, ctx:Java9_v2Parser.TypeImportOnDemandDeclarationContext):
        if ctx.getText() == "import" + self.package_identifier + ".*;"\
               or ctx.getText() == "import" + self.package_identifier + "." + self.class_identifier + ";":
            self.is_package_imported = True



    def exitFieldDeclaration(self, ctx: Java9_v2Parser.FieldDeclarationContext):
        if self.package_identifier is None \
                or self.package_identifier is not None \
                and self.is_package_imported:
            if ctx.unannType().getText() == self.class_identifier:
                # change the name class; (we find right class then change the name class)
                self.token_stream_rewriter.replaceIndex(
                    index=ctx.unannType().start.tokenIndex,
                    text=self.class_new_name)
                print("class name has change t new_class_name")

    # def enterExpressionName2(self, ctx:Java9_v2Parser.ExpressionName1Context):
    #     if self.is_package_imported \
    #             or self.package_identifier is None \
    #             or self.in_selected_package:
    #         if ctx.getText() == self.class_identifier:
    #             self.token_stream_rewriter.replaceIndex(
    #                 index=ctx.start.tokenIndex,
    #                 text=self.class_identifier)

    def enterAmbiguousName1(self, ctx:Java9_v2Parser.AmbiguousName1Context):
        if self.is_package_imported \
                or self.package_identifier is None \
                or self.in_selected_package:
            if ctx.getText() == self.class_identifier:
                print("enterAmbiguousName1")
                self.token_stream_rewriter.replaceIndex(
                    index=ctx.start.tokenIndex,
                    text=self.class_new_name)

    def enterClassInstanceCreationExpression_lfno_primary1(self, ctx:Java9_v2Parser.ClassInstanceCreationExpression_lfno_primary1Context):
        if self.is_package_imported \
                or self.package_identifier is None \
                or self.in_selected_package:
            if ctx.identifier(0).getText() == self.class_identifier:
                print("ClassInstanceCreationExpression_lfno_primary1")
                self.token_stream_rewriter.replaceIndex(
                    index=ctx.identifier(0).start.tokenIndex,
                    text=self.class_new_name)



    def enterTypeName1(self, ctx:Java9_v2Parser.TypeName1Context):
        if self.is_package_imported \
                or self.package_identifier is None \
                or self.in_selected_package:
            if ctx.identifier().getText() == self.class_identifier:
                print(" type name 1")
                self.token_stream_rewriter.replaceIndex(
                    index=ctx.identifier().start.tokenIndex,
                    text=self.class_new_name)


    def enterCompilationUnit1(self, ctx: Java9_v2Parser.CompilationUnit1Context):
        hidden = self.token_stream.getHiddenTokensToLeft(ctx.start.tokenIndex)
        self.token_stream_rewriter.replaceRange(from_idx=hidden[0].tokenIndex,
                                                to_idx=hidden[-1].tokenIndex,
                                                text='/*After refactoring (Refactored version)*/\n')



