from antlr4 import *
from antlr4.TokenStreamRewriter import TokenStreamRewriter

from refactorings.gen.Java9_v2Parser import Java9_v2Parser
from refactorings.gen.Java9_v2Listener import Java9_v2Listener


class MakeFieldStaticRefactoringListener(Java9_v2Listener):
    """
    To implement the encapsulate filed refactored
    Encapsulate field: Make a public field private and provide accessors
    """

    def __init__(self, common_token_stream: CommonTokenStream = None,
                 field_identifier: str = None):
        """
        :param common_token_stream:
        """
        self.token_stream = common_token_stream
        self.field_identifier = field_identifier
        # Move all the tokens in the source code in a buffer, token_stream_rewriter.
        if common_token_stream is not None:
            self.token_stream_rewriter = TokenStreamRewriter(common_token_stream)
        else:
            raise TypeError('common_token_stream is None')

    def exitFieldDeclaration(self, ctx: Java9_v2Parser.FieldDeclarationContext):
        if ctx.variableDeclaratorList().getText().split('=')[0] == self.field_identifier:
            if ctx.fieldModifier(0) == None:
                self.token_stream_rewriter.insertBeforeIndex(
                    index=ctx.start.tokenIndex,
                    text='static ')
            else:
                if ctx.fieldModifier(1) == None:
                    self.token_stream_rewriter.insertAfter(
                        index=ctx.fieldModifier(0).stop.tokenIndex,
                        text=' static')





    def exitAssignment(self, ctx: Java9_v2Parser.AssignmentContext):
        if ctx.leftHandSide().getText() == self.field_identifier or \
                ctx.leftHandSide().getText() == 'this.' + self.field_identifier:
            expr_code = self.token_stream_rewriter.getText(program_name=self.token_stream_rewriter.DEFAULT_PROGRAM_NAME,
                                                           start=ctx.expression().start.tokenIndex,
                                                           stop=ctx.expression().stop.tokenIndex)
            # new_code = 'this.set' + str.capitalize(self.field_identifier) + '(' + ctx.expression().getText() + ')'
            new_code = 'this.set' + str.capitalize(self.field_identifier) + '(' + expr_code + ')'
            self.token_stream_rewriter.replaceRange(ctx.start.tokenIndex, ctx.stop.tokenIndex, new_code)

    def exitPrimary(self, ctx: Java9_v2Parser.PrimaryContext):

        if ctx.getChildCount() == 2:
            if ctx.getText() == 'this.' + self.field_identifier or ctx.getText() == self.field_identifier:
                new_code = 'this.get' + str.capitalize(self.field_identifier) + '()'
                self.token_stream_rewriter.replaceRange(ctx.start.tokenIndex, ctx.stop.tokenIndex, new_code)

    def exitExpressionName2(self, ctx:Java9_v2Parser.ExpressionName2Context):
        if ctx.getChildCount() == 3:
            if ctx.children[2].getText() == self.field_identifier
                new_code = 'this.get' + str.capitalize(self.field_identifier) + '()'
                self.token_stream_rewriter.replaceRange(ctx.start.tokenIndex, ctx.stop.tokenIndex, new_code)


    def enterCompilationUnit1(self, ctx: Java9_v2Parser.CompilationUnit1Context):
        hidden = self.token_stream.getHiddenTokensToLeft(ctx.start.tokenIndex)
        self.token_stream_rewriter.replaceRange(from_idx=hidden[0].tokenIndex,
                                                to_idx=hidden[-1].tokenIndex,
                                                text='/*After refactoring (Refactored version)*/\n')

