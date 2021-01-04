// Generated from E:/Darses/Compiler/Project/CodART/grammars\Java9_v2.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java9_v2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java9_v2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java9_v2Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveType1}
	 * labeled alternative in {@link Java9_v2Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType1(Java9_v2Parser.PrimitiveType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveType2}
	 * labeled alternative in {@link Java9_v2Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType2(Java9_v2Parser.PrimitiveType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code numericType1}
	 * labeled alternative in {@link Java9_v2Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType1(Java9_v2Parser.NumericType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code numericType2}
	 * labeled alternative in {@link Java9_v2Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType2(Java9_v2Parser.NumericType2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java9_v2Parser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java9_v2Parser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceType1}
	 * labeled alternative in {@link Java9_v2Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType1(Java9_v2Parser.ReferenceType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceType2}
	 * labeled alternative in {@link Java9_v2Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType2(Java9_v2Parser.ReferenceType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceType3}
	 * labeled alternative in {@link Java9_v2Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType3(Java9_v2Parser.ReferenceType3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java9_v2Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classType1}
	 * labeled alternative in {@link Java9_v2Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType1(Java9_v2Parser.ClassType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classType2}
	 * labeled alternative in {@link Java9_v2Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType2(Java9_v2Parser.ClassType2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java9_v2Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java9_v2Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java9_v2Parser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java9_v2Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java9_v2Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java9_v2Parser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType1}
	 * labeled alternative in {@link Java9_v2Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType1(Java9_v2Parser.ArrayType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType2}
	 * labeled alternative in {@link Java9_v2Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType2(Java9_v2Parser.ArrayType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTyp3}
	 * labeled alternative in {@link Java9_v2Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTyp3(Java9_v2Parser.ArrayTyp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java9_v2Parser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java9_v2Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(Java9_v2Parser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBound1}
	 * labeled alternative in {@link Java9_v2Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound1(Java9_v2Parser.TypeBound1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBound2}
	 * labeled alternative in {@link Java9_v2Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound2(Java9_v2Parser.TypeBound2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java9_v2Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java9_v2Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java9_v2Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArgument1}
	 * labeled alternative in {@link Java9_v2Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument1(Java9_v2Parser.TypeArgument1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArgument2}
	 * labeled alternative in {@link Java9_v2Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument2(Java9_v2Parser.TypeArgument2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java9_v2Parser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildcardBounds1}
	 * labeled alternative in {@link Java9_v2Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds1(Java9_v2Parser.WildcardBounds1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code wildcardBound2}
	 * labeled alternative in {@link Java9_v2Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBound2(Java9_v2Parser.WildcardBound2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleName1}
	 * labeled alternative in {@link Java9_v2Parser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName1(Java9_v2Parser.ModuleName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleName2}
	 * labeled alternative in {@link Java9_v2Parser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName2(Java9_v2Parser.ModuleName2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code packageName2}
	 * labeled alternative in {@link Java9_v2Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName2(Java9_v2Parser.PackageName2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code packageName1}
	 * labeled alternative in {@link Java9_v2Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName1(Java9_v2Parser.PackageName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeName1}
	 * labeled alternative in {@link Java9_v2Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName1(Java9_v2Parser.TypeName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeName2}
	 * labeled alternative in {@link Java9_v2Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName2(Java9_v2Parser.TypeName2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code packageOrTypeName1}
	 * labeled alternative in {@link Java9_v2Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName1(Java9_v2Parser.PackageOrTypeName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code packageOrTypeName2}
	 * labeled alternative in {@link Java9_v2Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName2(Java9_v2Parser.PackageOrTypeName2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionName1}
	 * labeled alternative in {@link Java9_v2Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName1(Java9_v2Parser.ExpressionName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionName2}
	 * labeled alternative in {@link Java9_v2Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName2(Java9_v2Parser.ExpressionName2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java9_v2Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ambiguousName1}
	 * labeled alternative in {@link Java9_v2Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName1(Java9_v2Parser.AmbiguousName1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ambiguousName2}
	 * labeled alternative in {@link Java9_v2Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName2(Java9_v2Parser.AmbiguousName2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code compilationUnit1}
	 * labeled alternative in {@link Java9_v2Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit1(Java9_v2Parser.CompilationUnit1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code compilationUnit2}
	 * labeled alternative in {@link Java9_v2Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit2(Java9_v2Parser.CompilationUnit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(Java9_v2Parser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(Java9_v2Parser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java9_v2Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(Java9_v2Parser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration1(Java9_v2Parser.ImportDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code importDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration2(Java9_v2Parser.ImportDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code importDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration3(Java9_v2Parser.ImportDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code importDeclaration4}
	 * labeled alternative in {@link Java9_v2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration4(Java9_v2Parser.ImportDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(Java9_v2Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(Java9_v2Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(Java9_v2Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(Java9_v2Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration1(Java9_v2Parser.TypeDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration2(Java9_v2Parser.TypeDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration3(Java9_v2Parser.TypeDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(Java9_v2Parser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleDirective1}
	 * labeled alternative in {@link Java9_v2Parser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective1(Java9_v2Parser.ModuleDirective1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleDirective2}
	 * labeled alternative in {@link Java9_v2Parser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective2(Java9_v2Parser.ModuleDirective2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleDirectiv3}
	 * labeled alternative in {@link Java9_v2Parser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirectiv3(Java9_v2Parser.ModuleDirectiv3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleDirective4}
	 * labeled alternative in {@link Java9_v2Parser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective4(Java9_v2Parser.ModuleDirective4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleDirective5}
	 * labeled alternative in {@link Java9_v2Parser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective5(Java9_v2Parser.ModuleDirective5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(Java9_v2Parser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration1(Java9_v2Parser.ClassDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration2(Java9_v2Parser.ClassDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java9_v2Parser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(Java9_v2Parser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java9_v2Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java9_v2Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(Java9_v2Parser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(Java9_v2Parser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(Java9_v2Parser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java9_v2Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration1(Java9_v2Parser.ClassBodyDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration2(Java9_v2Parser.ClassBodyDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration3(Java9_v2Parser.ClassBodyDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclaration4}
	 * labeled alternative in {@link Java9_v2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration4(Java9_v2Parser.ClassBodyDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classMemberDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration1(Java9_v2Parser.ClassMemberDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classMemberDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration2(Java9_v2Parser.ClassMemberDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classMemberDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration3(Java9_v2Parser.ClassMemberDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classMemberDeclaration4}
	 * labeled alternative in {@link Java9_v2Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration4(Java9_v2Parser.ClassMemberDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classMemberDeclaration5}
	 * labeled alternative in {@link Java9_v2Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration5(Java9_v2Parser.ClassMemberDeclaration5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java9_v2Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(Java9_v2Parser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java9_v2Parser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java9_v2Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java9_v2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInitializer1}
	 * labeled alternative in {@link Java9_v2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer1(Java9_v2Parser.VariableInitializer1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableInitializer2}
	 * labeled alternative in {@link Java9_v2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer2(Java9_v2Parser.VariableInitializer2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannType1}
	 * labeled alternative in {@link Java9_v2Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType1(Java9_v2Parser.UnannType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannType2}
	 * labeled alternative in {@link Java9_v2Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType2(Java9_v2Parser.UnannType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannPrimitiveType1}
	 * labeled alternative in {@link Java9_v2Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType1(Java9_v2Parser.UnannPrimitiveType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannPrimitiveType2}
	 * labeled alternative in {@link Java9_v2Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType2(Java9_v2Parser.UnannPrimitiveType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannReferenceType1}
	 * labeled alternative in {@link Java9_v2Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType1(Java9_v2Parser.UnannReferenceType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannReferenceType2}
	 * labeled alternative in {@link Java9_v2Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType2(Java9_v2Parser.UnannReferenceType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannReferenceType3}
	 * labeled alternative in {@link Java9_v2Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType3(Java9_v2Parser.UnannReferenceType3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java9_v2Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unannClassType1}
	 * labeled alternative in {@link Java9_v2Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType1(Java9_v2Parser.UnannClassType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannClassType2}
	 * labeled alternative in {@link Java9_v2Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType2(Java9_v2Parser.UnannClassType2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java9_v2Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java9_v2Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java9_v2Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java9_v2Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java9_v2Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java9_v2Parser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unannArrayType1}
	 * labeled alternative in {@link Java9_v2Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType1(Java9_v2Parser.UnannArrayType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannArrayType2}
	 * labeled alternative in {@link Java9_v2Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType2(Java9_v2Parser.UnannArrayType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unannArrayTyp3}
	 * labeled alternative in {@link Java9_v2Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayTyp3(Java9_v2Parser.UnannArrayTyp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java9_v2Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(Java9_v2Parser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java9_v2Parser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java9_v2Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java9_v2Parser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameterList1}
	 * labeled alternative in {@link Java9_v2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList1(Java9_v2Parser.FormalParameterList1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameterList2}
	 * labeled alternative in {@link Java9_v2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList2(Java9_v2Parser.FormalParameterList2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameterList3}
	 * labeled alternative in {@link Java9_v2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList3(Java9_v2Parser.FormalParameterList3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameters1}
	 * labeled alternative in {@link Java9_v2Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters1(Java9_v2Parser.FormalParameters1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParameters2}
	 * labeled alternative in {@link Java9_v2Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters2(Java9_v2Parser.FormalParameters2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java9_v2Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java9_v2Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastFormalParameter1}
	 * labeled alternative in {@link Java9_v2Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter1(Java9_v2Parser.LastFormalParameter1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lastFormalParameter2}
	 * labeled alternative in {@link Java9_v2Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter2(Java9_v2Parser.LastFormalParameter2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java9_v2Parser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(Java9_v2Parser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java9_v2Parser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exceptionType1}
	 * labeled alternative in {@link Java9_v2Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType1(Java9_v2Parser.ExceptionType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exceptionType2}
	 * labeled alternative in {@link Java9_v2Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType2(Java9_v2Parser.ExceptionType2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java9_v2Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java9_v2Parser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java9_v2Parser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java9_v2Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(Java9_v2Parser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(Java9_v2Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java9_v2Parser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(Java9_v2Parser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitConstructorInvocation1}
	 * labeled alternative in {@link Java9_v2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation1(Java9_v2Parser.ExplicitConstructorInvocation1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitConstructorInvocation2}
	 * labeled alternative in {@link Java9_v2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation2(Java9_v2Parser.ExplicitConstructorInvocation2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitConstructorInvocation3}
	 * labeled alternative in {@link Java9_v2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation3(Java9_v2Parser.ExplicitConstructorInvocation3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitConstructorInvocation4}
	 * labeled alternative in {@link Java9_v2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation4(Java9_v2Parser.ExplicitConstructorInvocation4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java9_v2Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java9_v2Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(Java9_v2Parser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java9_v2Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(Java9_v2Parser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java9_v2Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration1(Java9_v2Parser.InterfaceDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration2(Java9_v2Parser.InterfaceDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java9_v2Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(Java9_v2Parser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(Java9_v2Parser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java9_v2Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration1(Java9_v2Parser.InterfaceMemberDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration2(Java9_v2Parser.InterfaceMemberDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration3(Java9_v2Parser.InterfaceMemberDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration4}
	 * labeled alternative in {@link Java9_v2Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration4(Java9_v2Parser.InterfaceMemberDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceMemberDeclaration5}
	 * labeled alternative in {@link Java9_v2Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration5(Java9_v2Parser.InterfaceMemberDeclaration5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java9_v2Parser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java9_v2Parser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java9_v2Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Java9_v2Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java9_v2Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java9_v2Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeMemberDeclaration1}
	 * labeled alternative in {@link Java9_v2Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration1(Java9_v2Parser.AnnotationTypeMemberDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeMemberDeclaration2}
	 * labeled alternative in {@link Java9_v2Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration2(Java9_v2Parser.AnnotationTypeMemberDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeMemberDeclaration3}
	 * labeled alternative in {@link Java9_v2Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration3(Java9_v2Parser.AnnotationTypeMemberDeclaration3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeMemberDeclaration4}
	 * labeled alternative in {@link Java9_v2Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration4(Java9_v2Parser.AnnotationTypeMemberDeclaration4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationTypeMemberDeclaration5}
	 * labeled alternative in {@link Java9_v2Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration5(Java9_v2Parser.AnnotationTypeMemberDeclaration5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java9_v2Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(Java9_v2Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Java9_v2Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotation1}
	 * labeled alternative in {@link Java9_v2Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation1(Java9_v2Parser.Annotation1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotation2}
	 * labeled alternative in {@link Java9_v2Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation2(Java9_v2Parser.Annotation2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code annotation3}
	 * labeled alternative in {@link Java9_v2Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation3(Java9_v2Parser.Annotation3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java9_v2Parser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java9_v2Parser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java9_v2Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValue1}
	 * labeled alternative in {@link Java9_v2Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue1(Java9_v2Parser.ElementValue1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValue2}
	 * labeled alternative in {@link Java9_v2Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue2(Java9_v2Parser.ElementValue2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code elementValu3}
	 * labeled alternative in {@link Java9_v2Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValu3(Java9_v2Parser.ElementValu3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java9_v2Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java9_v2Parser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java9_v2Parser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java9_v2Parser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java9_v2Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java9_v2Parser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java9_v2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java9_v2Parser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement1}
	 * labeled alternative in {@link Java9_v2Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement1(Java9_v2Parser.BlockStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement2}
	 * labeled alternative in {@link Java9_v2Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement2(Java9_v2Parser.BlockStatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement3}
	 * labeled alternative in {@link Java9_v2Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement3(Java9_v2Parser.BlockStatement3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java9_v2Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java9_v2Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement1}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement1(Java9_v2Parser.Statement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement2}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement2(Java9_v2Parser.Statement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement3}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement3(Java9_v2Parser.Statement3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement4}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement4(Java9_v2Parser.Statement4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement5}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement5(Java9_v2Parser.Statement5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statement6}
	 * labeled alternative in {@link Java9_v2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement6(Java9_v2Parser.Statement6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementNoShortIf1}
	 * labeled alternative in {@link Java9_v2Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf1(Java9_v2Parser.StatementNoShortIf1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementNoShortIf2}
	 * labeled alternative in {@link Java9_v2Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf2(Java9_v2Parser.StatementNoShortIf2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementNoShortIf3}
	 * labeled alternative in {@link Java9_v2Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf3(Java9_v2Parser.StatementNoShortIf3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementNoShortIf4}
	 * labeled alternative in {@link Java9_v2Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf4(Java9_v2Parser.StatementNoShortIf4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementNoShortIf5}
	 * labeled alternative in {@link Java9_v2Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf5(Java9_v2Parser.StatementNoShortIf5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement1}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement1(Java9_v2Parser.StatementWithoutTrailingSubstatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement2}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement2(Java9_v2Parser.StatementWithoutTrailingSubstatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement3}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement3(Java9_v2Parser.StatementWithoutTrailingSubstatement3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement4}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement4(Java9_v2Parser.StatementWithoutTrailingSubstatement4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement5}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement5(Java9_v2Parser.StatementWithoutTrailingSubstatement5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement6}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement6(Java9_v2Parser.StatementWithoutTrailingSubstatement6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement7}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement7(Java9_v2Parser.StatementWithoutTrailingSubstatement7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement8}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement8(Java9_v2Parser.StatementWithoutTrailingSubstatement8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement9}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement9(Java9_v2Parser.StatementWithoutTrailingSubstatement9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement10}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement10(Java9_v2Parser.StatementWithoutTrailingSubstatement10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement11}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement11(Java9_v2Parser.StatementWithoutTrailingSubstatement11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWithoutTrailingSubstatement12}
	 * labeled alternative in {@link Java9_v2Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement12(Java9_v2Parser.StatementWithoutTrailingSubstatement12Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java9_v2Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java9_v2Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java9_v2Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java9_v2Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression1}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression1(Java9_v2Parser.StatementExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression2}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression2(Java9_v2Parser.StatementExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression3}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression3(Java9_v2Parser.StatementExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression4}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression4(Java9_v2Parser.StatementExpression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression5}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression5(Java9_v2Parser.StatementExpression5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression6}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression6(Java9_v2Parser.StatementExpression6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression7}
	 * labeled alternative in {@link Java9_v2Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression7(Java9_v2Parser.StatementExpression7Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java9_v2Parser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java9_v2Parser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java9_v2Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertStatement1}
	 * labeled alternative in {@link Java9_v2Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement1(Java9_v2Parser.AssertStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assertStatement2}
	 * labeled alternative in {@link Java9_v2Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement2(Java9_v2Parser.AssertStatement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java9_v2Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(Java9_v2Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java9_v2Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(Java9_v2Parser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchLabel1}
	 * labeled alternative in {@link Java9_v2Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel1(Java9_v2Parser.SwitchLabel1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code switchLabel2}
	 * labeled alternative in {@link Java9_v2Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel2(Java9_v2Parser.SwitchLabel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code switchLabel3}
	 * labeled alternative in {@link Java9_v2Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel3(Java9_v2Parser.SwitchLabel3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(Java9_v2Parser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java9_v2Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java9_v2Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java9_v2Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement1}
	 * labeled alternative in {@link Java9_v2Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement1(Java9_v2Parser.ForStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement2}
	 * labeled alternative in {@link Java9_v2Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement2(Java9_v2Parser.ForStatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementNoShortIf3}
	 * labeled alternative in {@link Java9_v2Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf3(Java9_v2Parser.ForStatementNoShortIf3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementNoShortIf4}
	 * labeled alternative in {@link Java9_v2Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf4(Java9_v2Parser.ForStatementNoShortIf4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java9_v2Parser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java9_v2Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInit1}
	 * labeled alternative in {@link Java9_v2Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit1(Java9_v2Parser.ForInit1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code forInit2}
	 * labeled alternative in {@link Java9_v2Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit2(Java9_v2Parser.ForInit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java9_v2Parser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java9_v2Parser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java9_v2Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(Java9_v2Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java9_v2Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java9_v2Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java9_v2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java9_v2Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java9_v2Parser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement1}
	 * labeled alternative in {@link Java9_v2Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement1(Java9_v2Parser.TryStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement2}
	 * labeled alternative in {@link Java9_v2Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement2(Java9_v2Parser.TryStatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement3}
	 * labeled alternative in {@link Java9_v2Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement3(Java9_v2Parser.TryStatement3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java9_v2Parser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java9_v2Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java9_v2Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java9_v2Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(Java9_v2Parser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(Java9_v2Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java9_v2Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(Java9_v2Parser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resource1}
	 * labeled alternative in {@link Java9_v2Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource1(Java9_v2Parser.Resource1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code resource2}
	 * labeled alternative in {@link Java9_v2Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource2(Java9_v2Parser.Resource2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAccess1}
	 * labeled alternative in {@link Java9_v2Parser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess1(Java9_v2Parser.VariableAccess1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableAccess2}
	 * labeled alternative in {@link Java9_v2Parser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess2(Java9_v2Parser.VariableAccess2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java9_v2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray1(Java9_v2Parser.PrimaryNoNewArray1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray2(Java9_v2Parser.PrimaryNoNewArray2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray3(Java9_v2Parser.PrimaryNoNewArray3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray4(Java9_v2Parser.PrimaryNoNewArray4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray5}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray5(Java9_v2Parser.PrimaryNoNewArray5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray6}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray6(Java9_v2Parser.PrimaryNoNewArray6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray7}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray7(Java9_v2Parser.PrimaryNoNewArray7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray8}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray8(Java9_v2Parser.PrimaryNoNewArray8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray9}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray9(Java9_v2Parser.PrimaryNoNewArray9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray10}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray10(Java9_v2Parser.PrimaryNoNewArray10Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java9_v2Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess1(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess2(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess3(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess4(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess5}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess5(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess6}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess6(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess7}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess7(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess8}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess8(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess9}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess9(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_arrayAccess10}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess10(Java9_v2Parser.PrimaryNoNewArray_lfno_arrayAccess10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary1(Java9_v2Parser.PrimaryNoNewArray_lf_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary2(Java9_v2Parser.PrimaryNoNewArray_lf_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary3(Java9_v2Parser.PrimaryNoNewArray_lf_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary4(Java9_v2Parser.PrimaryNoNewArray_lf_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary5}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary5(Java9_v2Parser.PrimaryNoNewArray_lf_primary5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java9_v2Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary1(Java9_v2Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary2(Java9_v2Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary3(Java9_v2Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary4(Java9_v2Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary1(Java9_v2Parser.PrimaryNoNewArray_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary2(Java9_v2Parser.PrimaryNoNewArray_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary3(Java9_v2Parser.PrimaryNoNewArray_lfno_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary4(Java9_v2Parser.PrimaryNoNewArray_lfno_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary5}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary5(Java9_v2Parser.PrimaryNoNewArray_lfno_primary5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary6}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary6(Java9_v2Parser.PrimaryNoNewArray_lfno_primary6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary7}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary7(Java9_v2Parser.PrimaryNoNewArray_lfno_primary7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary8}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary8(Java9_v2Parser.PrimaryNoNewArray_lfno_primary8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary9}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary9(Java9_v2Parser.PrimaryNoNewArray_lfno_primary9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary10}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary10(Java9_v2Parser.PrimaryNoNewArray_lfno_primary10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary11}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary11(Java9_v2Parser.PrimaryNoNewArray_lfno_primary11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary12}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary12(Java9_v2Parser.PrimaryNoNewArray_lfno_primary12Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary1(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary2(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary3}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary3(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary4}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary4(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary5}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary5(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary6}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary6(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary7}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary7(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary8}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary8(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary9}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary9(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary10}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary10(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary11}
	 * labeled alternative in {@link Java9_v2Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary11(Java9_v2Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classLiteral1}
	 * labeled alternative in {@link Java9_v2Parser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral1(Java9_v2Parser.ClassLiteral1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classLiteral2}
	 * labeled alternative in {@link Java9_v2Parser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral2(Java9_v2Parser.ClassLiteral2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classInstanceCreationExpression1}
	 * labeled alternative in {@link Java9_v2Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression1(Java9_v2Parser.ClassInstanceCreationExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classInstanceCreationExpression2}
	 * labeled alternative in {@link Java9_v2Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression2(Java9_v2Parser.ClassInstanceCreationExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classInstanceCreationExpression3}
	 * labeled alternative in {@link Java9_v2Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression3(Java9_v2Parser.ClassInstanceCreationExpression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java9_v2Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classInstanceCreationExpression_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary1(Java9_v2Parser.ClassInstanceCreationExpression_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classInstanceCreationExpression_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary2(Java9_v2Parser.ClassInstanceCreationExpression_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArgumentsOrDiamond1}
	 * labeled alternative in {@link Java9_v2Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond1(Java9_v2Parser.TypeArgumentsOrDiamond1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code typeArgumentsOrDiamond2}
	 * labeled alternative in {@link Java9_v2Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond2(Java9_v2Parser.TypeArgumentsOrDiamond2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess1}
	 * labeled alternative in {@link Java9_v2Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess1(Java9_v2Parser.FieldAccess1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess2}
	 * labeled alternative in {@link Java9_v2Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess2(Java9_v2Parser.FieldAccess2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess3}
	 * labeled alternative in {@link Java9_v2Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess3(Java9_v2Parser.FieldAccess3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java9_v2Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary1(Java9_v2Parser.FieldAccess_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary2(Java9_v2Parser.FieldAccess_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java9_v2Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java9_v2Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java9_v2Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation1}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation1(Java9_v2Parser.MethodInvocation1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation2}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation2(Java9_v2Parser.MethodInvocation2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation3}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation3(Java9_v2Parser.MethodInvocation3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation4}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation4(Java9_v2Parser.MethodInvocation4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation5}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation5(Java9_v2Parser.MethodInvocation5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation6}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation6(Java9_v2Parser.MethodInvocation6Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java9_v2Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary1(Java9_v2Parser.MethodInvocation_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary2(Java9_v2Parser.MethodInvocation_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation_lfno_primary3}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary3(Java9_v2Parser.MethodInvocation_lfno_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation_lfno_primary4}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary4(Java9_v2Parser.MethodInvocation_lfno_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation_lfno_primary5}
	 * labeled alternative in {@link Java9_v2Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary5(Java9_v2Parser.MethodInvocation_lfno_primary5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java9_v2Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference1}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference1(Java9_v2Parser.MethodReference1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference2}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference2(Java9_v2Parser.MethodReference2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference3}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference3(Java9_v2Parser.MethodReference3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference4}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference4(Java9_v2Parser.MethodReference4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference5}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference5(Java9_v2Parser.MethodReference5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference6}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference6(Java9_v2Parser.MethodReference6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference7}
	 * labeled alternative in {@link Java9_v2Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference7(Java9_v2Parser.MethodReference7Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java9_v2Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary1}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary1(Java9_v2Parser.MethodReference_lfno_primary1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary2}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary2(Java9_v2Parser.MethodReference_lfno_primary2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary3}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary3(Java9_v2Parser.MethodReference_lfno_primary3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary4}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary4(Java9_v2Parser.MethodReference_lfno_primary4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary5}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary5(Java9_v2Parser.MethodReference_lfno_primary5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference_lfno_primary6}
	 * labeled alternative in {@link Java9_v2Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary6(Java9_v2Parser.MethodReference_lfno_primary6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreationExpression1}
	 * labeled alternative in {@link Java9_v2Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression1(Java9_v2Parser.ArrayCreationExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreationExpression2}
	 * labeled alternative in {@link Java9_v2Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression2(Java9_v2Parser.ArrayCreationExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreationExpression3}
	 * labeled alternative in {@link Java9_v2Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression3(Java9_v2Parser.ArrayCreationExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreationExpression4}
	 * labeled alternative in {@link Java9_v2Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression4(Java9_v2Parser.ArrayCreationExpression4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java9_v2Parser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java9_v2Parser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java9_v2Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link Java9_v2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(Java9_v2Parser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link Java9_v2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(Java9_v2Parser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java9_v2Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters1}
	 * labeled alternative in {@link Java9_v2Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters1(Java9_v2Parser.LambdaParameters1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters2}
	 * labeled alternative in {@link Java9_v2Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters2(Java9_v2Parser.LambdaParameters2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaParameters3}
	 * labeled alternative in {@link Java9_v2Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters3(Java9_v2Parser.LambdaParameters3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java9_v2Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaBody1}
	 * labeled alternative in {@link Java9_v2Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody1(Java9_v2Parser.LambdaBody1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaBody2}
	 * labeled alternative in {@link Java9_v2Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody2(Java9_v2Parser.LambdaBody2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression1}
	 * labeled alternative in {@link Java9_v2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression1(Java9_v2Parser.AssignmentExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression2}
	 * labeled alternative in {@link Java9_v2Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression2(Java9_v2Parser.AssignmentExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java9_v2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftHandSide3}
	 * labeled alternative in {@link Java9_v2Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide3(Java9_v2Parser.LeftHandSide3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code leftHandSide4}
	 * labeled alternative in {@link Java9_v2Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide4(Java9_v2Parser.LeftHandSide4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code leftHandSide5}
	 * labeled alternative in {@link Java9_v2Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide5(Java9_v2Parser.LeftHandSide5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java9_v2Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression1}
	 * labeled alternative in {@link Java9_v2Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression1(Java9_v2Parser.ConditionalExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression2}
	 * labeled alternative in {@link Java9_v2Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression2(Java9_v2Parser.ConditionalExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalOrExpression1}
	 * labeled alternative in {@link Java9_v2Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression1(Java9_v2Parser.ConditionalOrExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalOrExpression2}
	 * labeled alternative in {@link Java9_v2Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression2(Java9_v2Parser.ConditionalOrExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalAndExpression2}
	 * labeled alternative in {@link Java9_v2Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression2(Java9_v2Parser.ConditionalAndExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalAndExpression1}
	 * labeled alternative in {@link Java9_v2Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression1(Java9_v2Parser.ConditionalAndExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression2}
	 * labeled alternative in {@link Java9_v2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression2(Java9_v2Parser.InclusiveOrExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression1}
	 * labeled alternative in {@link Java9_v2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression1(Java9_v2Parser.InclusiveOrExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression1}
	 * labeled alternative in {@link Java9_v2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression1(Java9_v2Parser.ExclusiveOrExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression2}
	 * labeled alternative in {@link Java9_v2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression2(Java9_v2Parser.ExclusiveOrExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression2}
	 * labeled alternative in {@link Java9_v2Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression2(Java9_v2Parser.AndExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression1}
	 * labeled alternative in {@link Java9_v2Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression1(Java9_v2Parser.AndExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression3}
	 * labeled alternative in {@link Java9_v2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression3(Java9_v2Parser.EqualityExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression2}
	 * labeled alternative in {@link Java9_v2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression2(Java9_v2Parser.EqualityExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression1}
	 * labeled alternative in {@link Java9_v2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression1(Java9_v2Parser.EqualityExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression1}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression1(Java9_v2Parser.RelationalExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression2}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression2(Java9_v2Parser.RelationalExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression5}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression5(Java9_v2Parser.RelationalExpression5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression6}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression6(Java9_v2Parser.RelationalExpression6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression3}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression3(Java9_v2Parser.RelationalExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression4}
	 * labeled alternative in {@link Java9_v2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression4(Java9_v2Parser.RelationalExpression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression1}
	 * labeled alternative in {@link Java9_v2Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression1(Java9_v2Parser.ShiftExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression3}
	 * labeled alternative in {@link Java9_v2Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression3(Java9_v2Parser.ShiftExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression2}
	 * labeled alternative in {@link Java9_v2Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression2(Java9_v2Parser.ShiftExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression4}
	 * labeled alternative in {@link Java9_v2Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression4(Java9_v2Parser.ShiftExpression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression1}
	 * labeled alternative in {@link Java9_v2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression1(Java9_v2Parser.AdditiveExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression3}
	 * labeled alternative in {@link Java9_v2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression3(Java9_v2Parser.AdditiveExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpressio2}
	 * labeled alternative in {@link Java9_v2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpressio2(Java9_v2Parser.AdditiveExpressio2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression1}
	 * labeled alternative in {@link Java9_v2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression1(Java9_v2Parser.MultiplicativeExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression4}
	 * labeled alternative in {@link Java9_v2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression4(Java9_v2Parser.MultiplicativeExpression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression3}
	 * labeled alternative in {@link Java9_v2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression3(Java9_v2Parser.MultiplicativeExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression2}
	 * labeled alternative in {@link Java9_v2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression2(Java9_v2Parser.MultiplicativeExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression1}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression1(Java9_v2Parser.UnaryExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression2}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression2(Java9_v2Parser.UnaryExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression3}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression3(Java9_v2Parser.UnaryExpression3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression4}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression4(Java9_v2Parser.UnaryExpression4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression5}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression5(Java9_v2Parser.UnaryExpression5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java9_v2Parser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java9_v2Parser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNotPlusMinus1}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus1(Java9_v2Parser.UnaryExpressionNotPlusMinus1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNotPlusMinus2}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus2(Java9_v2Parser.UnaryExpressionNotPlusMinus2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNotPlusMinus3}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus3(Java9_v2Parser.UnaryExpressionNotPlusMinus3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNotPlusMinus4}
	 * labeled alternative in {@link Java9_v2Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus4(Java9_v2Parser.UnaryExpressionNotPlusMinus4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java9_v2Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java9_v2Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java9_v2Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java9_v2Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java9_v2Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression1}
	 * labeled alternative in {@link Java9_v2Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression1(Java9_v2Parser.CastExpression1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression2}
	 * labeled alternative in {@link Java9_v2Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression2(Java9_v2Parser.CastExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression3}
	 * labeled alternative in {@link Java9_v2Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression3(Java9_v2Parser.CastExpression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java9_v2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Java9_v2Parser.IdentifierContext ctx);
}