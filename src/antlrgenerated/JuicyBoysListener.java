package antlrgenerated;
// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuicyBoysParser}.
 */
public interface JuicyBoysListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JuicyBoysParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JuicyBoysParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JuicyBoysParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JuicyBoysParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JuicyBoysParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JuicyBoysParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JuicyBoysParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JuicyBoysParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JuicyBoysParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JuicyBoysParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JuicyBoysParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JuicyBoysParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JuicyBoysParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JuicyBoysParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JuicyBoysParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JuicyBoysParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JuicyBoysParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JuicyBoysParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JuicyBoysParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JuicyBoysParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JuicyBoysParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JuicyBoysParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JuicyBoysParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JuicyBoysParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JuicyBoysParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JuicyBoysParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JuicyBoysParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JuicyBoysParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JuicyBoysParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JuicyBoysParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JuicyBoysParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JuicyBoysParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JuicyBoysParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JuicyBoysParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JuicyBoysParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JuicyBoysParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JuicyBoysParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JuicyBoysParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JuicyBoysParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JuicyBoysParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JuicyBoysParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JuicyBoysParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JuicyBoysParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JuicyBoysParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JuicyBoysParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JuicyBoysParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JuicyBoysParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JuicyBoysParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JuicyBoysParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JuicyBoysParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JuicyBoysParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JuicyBoysParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JuicyBoysParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JuicyBoysParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JuicyBoysParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JuicyBoysParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JuicyBoysParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JuicyBoysParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JuicyBoysParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JuicyBoysParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JuicyBoysParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JuicyBoysParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JuicyBoysParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JuicyBoysParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JuicyBoysParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JuicyBoysParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JuicyBoysParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JuicyBoysParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JuicyBoysParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JuicyBoysParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JuicyBoysParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JuicyBoysParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JuicyBoysParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JuicyBoysParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JuicyBoysParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JuicyBoysParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JuicyBoysParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JuicyBoysParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JuicyBoysParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JuicyBoysParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JuicyBoysParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JuicyBoysParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JuicyBoysParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JuicyBoysParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JuicyBoysParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JuicyBoysParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JuicyBoysParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JuicyBoysParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(JuicyBoysParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(JuicyBoysParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(JuicyBoysParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(JuicyBoysParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JuicyBoysParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JuicyBoysParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JuicyBoysParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JuicyBoysParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JuicyBoysParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JuicyBoysParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JuicyBoysParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JuicyBoysParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JuicyBoysParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JuicyBoysParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JuicyBoysParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JuicyBoysParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JuicyBoysParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JuicyBoysParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JuicyBoysParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JuicyBoysParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JuicyBoysParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JuicyBoysParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JuicyBoysParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JuicyBoysParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JuicyBoysParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JuicyBoysParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JuicyBoysParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JuicyBoysParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JuicyBoysParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JuicyBoysParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JuicyBoysParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JuicyBoysParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JuicyBoysParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JuicyBoysParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JuicyBoysParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JuicyBoysParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JuicyBoysParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JuicyBoysParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JuicyBoysParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JuicyBoysParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JuicyBoysParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JuicyBoysParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JuicyBoysParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JuicyBoysParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JuicyBoysParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JuicyBoysParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JuicyBoysParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JuicyBoysParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JuicyBoysParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JuicyBoysParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JuicyBoysParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JuicyBoysParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JuicyBoysParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JuicyBoysParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JuicyBoysParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JuicyBoysParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JuicyBoysParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JuicyBoysParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JuicyBoysParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JuicyBoysParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JuicyBoysParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JuicyBoysParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JuicyBoysParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JuicyBoysParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JuicyBoysParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JuicyBoysParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JuicyBoysParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JuicyBoysParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JuicyBoysParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JuicyBoysParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JuicyBoysParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JuicyBoysParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JuicyBoysParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JuicyBoysParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JuicyBoysParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JuicyBoysParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JuicyBoysParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JuicyBoysParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JuicyBoysParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JuicyBoysParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JuicyBoysParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JuicyBoysParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JuicyBoysParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JuicyBoysParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JuicyBoysParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JuicyBoysParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JuicyBoysParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JuicyBoysParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JuicyBoysParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JuicyBoysParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JuicyBoysParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JuicyBoysParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JuicyBoysParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JuicyBoysParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JuicyBoysParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JuicyBoysParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JuicyBoysParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JuicyBoysParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JuicyBoysParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JuicyBoysParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JuicyBoysParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JuicyBoysParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JuicyBoysParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JuicyBoysParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JuicyBoysParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JuicyBoysParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JuicyBoysParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JuicyBoysParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JuicyBoysParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JuicyBoysParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JuicyBoysParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JuicyBoysParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JuicyBoysParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JuicyBoysParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JuicyBoysParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JuicyBoysParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JuicyBoysParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JuicyBoysParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JuicyBoysParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JuicyBoysParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JuicyBoysParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JuicyBoysParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JuicyBoysParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JuicyBoysParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JuicyBoysParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JuicyBoysParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JuicyBoysParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JuicyBoysParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JuicyBoysParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JuicyBoysParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JuicyBoysParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JuicyBoysParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JuicyBoysParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JuicyBoysParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JuicyBoysParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JuicyBoysParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JuicyBoysParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JuicyBoysParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JuicyBoysParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JuicyBoysParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JuicyBoysParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JuicyBoysParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JuicyBoysParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JuicyBoysParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JuicyBoysParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JuicyBoysParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JuicyBoysParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JuicyBoysParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JuicyBoysParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JuicyBoysParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JuicyBoysParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JuicyBoysParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JuicyBoysParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JuicyBoysParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JuicyBoysParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JuicyBoysParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JuicyBoysParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JuicyBoysParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JuicyBoysParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JuicyBoysParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JuicyBoysParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JuicyBoysParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JuicyBoysParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JuicyBoysParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JuicyBoysParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JuicyBoysParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JuicyBoysParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JuicyBoysParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JuicyBoysParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JuicyBoysParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JuicyBoysParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JuicyBoysParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JuicyBoysParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JuicyBoysParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JuicyBoysParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JuicyBoysParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JuicyBoysParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JuicyBoysParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JuicyBoysParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JuicyBoysParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JuicyBoysParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JuicyBoysParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JuicyBoysParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JuicyBoysParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JuicyBoysParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JuicyBoysParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JuicyBoysParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JuicyBoysParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JuicyBoysParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JuicyBoysParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JuicyBoysParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JuicyBoysParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JuicyBoysParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JuicyBoysParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JuicyBoysParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JuicyBoysParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JuicyBoysParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JuicyBoysParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JuicyBoysParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JuicyBoysParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JuicyBoysParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JuicyBoysParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JuicyBoysParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JuicyBoysParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JuicyBoysParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JuicyBoysParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JuicyBoysParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JuicyBoysParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JuicyBoysParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JuicyBoysParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JuicyBoysParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JuicyBoysParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JuicyBoysParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JuicyBoysParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JuicyBoysParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JuicyBoysParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JuicyBoysParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JuicyBoysParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JuicyBoysParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JuicyBoysParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JuicyBoysParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JuicyBoysParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JuicyBoysParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JuicyBoysParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JuicyBoysParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JuicyBoysParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JuicyBoysParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JuicyBoysParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JuicyBoysParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JuicyBoysParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JuicyBoysParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JuicyBoysParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JuicyBoysParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JuicyBoysParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JuicyBoysParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JuicyBoysParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(JuicyBoysParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(JuicyBoysParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JuicyBoysParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JuicyBoysParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JuicyBoysParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JuicyBoysParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JuicyBoysParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JuicyBoysParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JuicyBoysParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JuicyBoysParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JuicyBoysParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JuicyBoysParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JuicyBoysParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JuicyBoysParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JuicyBoysParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JuicyBoysParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JuicyBoysParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JuicyBoysParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JuicyBoysParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JuicyBoysParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JuicyBoysParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JuicyBoysParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JuicyBoysParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JuicyBoysParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JuicyBoysParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JuicyBoysParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JuicyBoysParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JuicyBoysParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JuicyBoysParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JuicyBoysParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JuicyBoysParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JuicyBoysParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JuicyBoysParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JuicyBoysParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JuicyBoysParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JuicyBoysParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(JuicyBoysParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(JuicyBoysParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(JuicyBoysParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(JuicyBoysParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JuicyBoysParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JuicyBoysParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(JuicyBoysParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(JuicyBoysParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(JuicyBoysParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(JuicyBoysParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JuicyBoysParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JuicyBoysParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JuicyBoysParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JuicyBoysParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JuicyBoysParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JuicyBoysParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JuicyBoysParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JuicyBoysParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JuicyBoysParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JuicyBoysParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JuicyBoysParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JuicyBoysParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JuicyBoysParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JuicyBoysParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JuicyBoysParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JuicyBoysParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JuicyBoysParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JuicyBoysParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JuicyBoysParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JuicyBoysParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(JuicyBoysParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(JuicyBoysParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JuicyBoysParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JuicyBoysParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JuicyBoysParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JuicyBoysParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JuicyBoysParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JuicyBoysParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JuicyBoysParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JuicyBoysParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JuicyBoysParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JuicyBoysParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JuicyBoysParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JuicyBoysParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JuicyBoysParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JuicyBoysParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JuicyBoysParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JuicyBoysParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JuicyBoysParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JuicyBoysParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JuicyBoysParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JuicyBoysParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JuicyBoysParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JuicyBoysParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(JuicyBoysParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(JuicyBoysParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JuicyBoysParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JuicyBoysParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(JuicyBoysParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(JuicyBoysParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JuicyBoysParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JuicyBoysParser.CastExpressionContext ctx);
}