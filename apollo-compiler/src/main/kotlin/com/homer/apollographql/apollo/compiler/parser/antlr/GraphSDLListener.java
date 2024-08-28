// Generated from com/apollographql/apollo/compiler/parser/antlr/GraphSDL.g4 by ANTLR 4.5.3

package com.homer.apollographql.apollo.compiler.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphSDLParser}.
 */
public interface GraphSDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(GraphSDLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(GraphSDLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#schemaDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDefinition(GraphSDLParser.SchemaDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#schemaDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDefinition(GraphSDLParser.SchemaDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#operationTypesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationTypesDefinition(GraphSDLParser.OperationTypesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#operationTypesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationTypesDefinition(GraphSDLParser.OperationTypesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#operationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationTypeDefinition(GraphSDLParser.OperationTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#operationTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationTypeDefinition(GraphSDLParser.OperationTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#operationType}.
	 * @param ctx the parse tree
	 */
	void enterOperationType(GraphSDLParser.OperationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#operationType}.
	 * @param ctx the parse tree
	 */
	void exitOperationType(GraphSDLParser.OperationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(GraphSDLParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(GraphSDLParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#enumTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeDefinition(GraphSDLParser.EnumTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#enumTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeDefinition(GraphSDLParser.EnumTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#enumValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumValuesDefinition(GraphSDLParser.EnumValuesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#enumValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumValuesDefinition(GraphSDLParser.EnumValuesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#enumValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueDefinition(GraphSDLParser.EnumValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#enumValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueDefinition(GraphSDLParser.EnumValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#objectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeDefinition(GraphSDLParser.ObjectTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#objectTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeDefinition(GraphSDLParser.ObjectTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#implementsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterImplementsInterfaces(GraphSDLParser.ImplementsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#implementsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitImplementsInterfaces(GraphSDLParser.ImplementsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#implementsInterface}.
	 * @param ctx the parse tree
	 */
	void enterImplementsInterface(GraphSDLParser.ImplementsInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#implementsInterface}.
	 * @param ctx the parse tree
	 */
	void exitImplementsInterface(GraphSDLParser.ImplementsInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#interfaceTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeDefinition(GraphSDLParser.InterfaceTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#interfaceTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeDefinition(GraphSDLParser.InterfaceTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#fieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldsDefinition(GraphSDLParser.FieldsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#fieldsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldsDefinition(GraphSDLParser.FieldsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(GraphSDLParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(GraphSDLParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDefinition(GraphSDLParser.ArgumentsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDefinition(GraphSDLParser.ArgumentsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefinition(GraphSDLParser.ArgumentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefinition(GraphSDLParser.ArgumentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#unionTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeDefinition(GraphSDLParser.UnionTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#unionTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeDefinition(GraphSDLParser.UnionTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberTypes(GraphSDLParser.UnionMemberTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberTypes(GraphSDLParser.UnionMemberTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#scalarTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScalarTypeDefinition(GraphSDLParser.ScalarTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#scalarTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScalarTypeDefinition(GraphSDLParser.ScalarTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#inputObjectDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputObjectDefinition(GraphSDLParser.InputObjectDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#inputObjectDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputObjectDefinition(GraphSDLParser.InputObjectDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#inputValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputValuesDefinition(GraphSDLParser.InputValuesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#inputValuesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputValuesDefinition(GraphSDLParser.InputValuesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#inputValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputValueDefinition(GraphSDLParser.InputValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#inputValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputValueDefinition(GraphSDLParser.InputValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directiveDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDefinition(GraphSDLParser.DirectiveDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directiveDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDefinition(GraphSDLParser.DirectiveDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directiveLocations}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveLocations(GraphSDLParser.DirectiveLocationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directiveLocations}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveLocations(GraphSDLParser.DirectiveLocationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directiveLocation}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveLocation(GraphSDLParser.DirectiveLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directiveLocation}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveLocation(GraphSDLParser.DirectiveLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#typeSystemExtension}.
	 * @param ctx the parse tree
	 */
	void enterTypeSystemExtension(GraphSDLParser.TypeSystemExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#typeSystemExtension}.
	 * @param ctx the parse tree
	 */
	void exitTypeSystemExtension(GraphSDLParser.TypeSystemExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#schemaExtension}.
	 * @param ctx the parse tree
	 */
	void enterSchemaExtension(GraphSDLParser.SchemaExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#schemaExtension}.
	 * @param ctx the parse tree
	 */
	void exitSchemaExtension(GraphSDLParser.SchemaExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void enterTypeExtension(GraphSDLParser.TypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void exitTypeExtension(GraphSDLParser.TypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#objectTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeExtensionDefinition(GraphSDLParser.ObjectTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#objectTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeExtensionDefinition(GraphSDLParser.ObjectTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#interfaceTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeExtensionDefinition(GraphSDLParser.InterfaceTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#interfaceTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeExtensionDefinition(GraphSDLParser.InterfaceTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#unionTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeExtensionDefinition(GraphSDLParser.UnionTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#unionTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeExtensionDefinition(GraphSDLParser.UnionTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#scalarTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterScalarTypeExtensionDefinition(GraphSDLParser.ScalarTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#scalarTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitScalarTypeExtensionDefinition(GraphSDLParser.ScalarTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#enumTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeExtensionDefinition(GraphSDLParser.EnumTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#enumTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeExtensionDefinition(GraphSDLParser.EnumTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#inputObjectTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputObjectTypeExtensionDefinition(GraphSDLParser.InputObjectTypeExtensionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#inputObjectTypeExtensionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputObjectTypeExtensionDefinition(GraphSDLParser.InputObjectTypeExtensionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GraphSDLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GraphSDLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GraphSDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GraphSDLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#namedType}.
	 * @param ctx the parse tree
	 */
	void enterNamedType(GraphSDLParser.NamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#namedType}.
	 * @param ctx the parse tree
	 */
	void exitNamedType(GraphSDLParser.NamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(GraphSDLParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(GraphSDLParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#nonNullType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullType(GraphSDLParser.NonNullTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#nonNullType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullType(GraphSDLParser.NonNullTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(GraphSDLParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(GraphSDLParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(GraphSDLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(GraphSDLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GraphSDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GraphSDLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(GraphSDLParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(GraphSDLParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(GraphSDLParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(GraphSDLParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(GraphSDLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(GraphSDLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(GraphSDLParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(GraphSDLParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(GraphSDLParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(GraphSDLParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(GraphSDLParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(GraphSDLParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(GraphSDLParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(GraphSDLParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(GraphSDLParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(GraphSDLParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#objectField}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(GraphSDLParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#objectField}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(GraphSDLParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(GraphSDLParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(GraphSDLParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(GraphSDLParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(GraphSDLParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArguments(GraphSDLParser.DirectiveArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directiveArguments}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArguments(GraphSDLParser.DirectiveArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSDLParser#directiveArgument}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveArgument(GraphSDLParser.DirectiveArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSDLParser#directiveArgument}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveArgument(GraphSDLParser.DirectiveArgumentContext ctx);
}