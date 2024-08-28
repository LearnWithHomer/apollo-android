// Generated from com/apollographql/apollo/compiler/parser/antlr/GraphSDL.g4 by ANTLR 4.5.3

package com.homer.apollographql.apollo.compiler.parser.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphSDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, SCHEMA=16, 
		QUERY=17, MUTATION=18, SUBSCRIPTION=19, ENUM=20, TYPE=21, IMPLEMENTS=22, 
		INTERFACE=23, UNION=24, SCALAR=25, INPUT=26, DIRECTIVE=27, REPEATABLE=28, 
		ON_KEYWORD=29, EXTEND=30, NAME=31, STRING=32, BLOCK_STRING=33, FLOAT=34, 
		INT=35, WS=36, COMMA=37, COMMENT=38, UNICODE_BOM=39, UTF8_BOM=40, UTF16_BOM=41, 
		UTF32_BOM=42;
	public static final int
		RULE_document = 0, RULE_schemaDefinition = 1, RULE_operationTypesDefinition = 2, 
		RULE_operationTypeDefinition = 3, RULE_operationType = 4, RULE_typeDefinition = 5, 
		RULE_enumTypeDefinition = 6, RULE_enumValuesDefinition = 7, RULE_enumValueDefinition = 8, 
		RULE_objectTypeDefinition = 9, RULE_implementsInterfaces = 10, RULE_implementsInterface = 11, 
		RULE_interfaceTypeDefinition = 12, RULE_fieldsDefinition = 13, RULE_fieldDefinition = 14, 
		RULE_argumentsDefinition = 15, RULE_argumentDefinition = 16, RULE_unionTypeDefinition = 17, 
		RULE_unionMemberTypes = 18, RULE_scalarTypeDefinition = 19, RULE_inputObjectDefinition = 20, 
		RULE_inputValuesDefinition = 21, RULE_inputValueDefinition = 22, RULE_directiveDefinition = 23, 
		RULE_directiveLocations = 24, RULE_directiveLocation = 25, RULE_typeSystemExtension = 26, 
		RULE_schemaExtension = 27, RULE_typeExtension = 28, RULE_objectTypeExtensionDefinition = 29, 
		RULE_interfaceTypeExtensionDefinition = 30, RULE_unionTypeExtensionDefinition = 31, 
		RULE_scalarTypeExtensionDefinition = 32, RULE_enumTypeExtensionDefinition = 33, 
		RULE_inputObjectTypeExtensionDefinition = 34, RULE_name = 35, RULE_type = 36, 
		RULE_namedType = 37, RULE_listType = 38, RULE_nonNullType = 39, RULE_description = 40, 
		RULE_defaultValue = 41, RULE_value = 42, RULE_intValue = 43, RULE_floatValue = 44, 
		RULE_booleanValue = 45, RULE_stringValue = 46, RULE_nullValue = 47, RULE_enumValue = 48, 
		RULE_listValue = 49, RULE_objectValue = 50, RULE_objectField = 51, RULE_directives = 52, 
		RULE_directive = 53, RULE_directiveArguments = 54, RULE_directiveArgument = 55;
	public static final String[] ruleNames = {
		"document", "schemaDefinition", "operationTypesDefinition", "operationTypeDefinition", 
		"operationType", "typeDefinition", "enumTypeDefinition", "enumValuesDefinition", 
		"enumValueDefinition", "objectTypeDefinition", "implementsInterfaces", 
		"implementsInterface", "interfaceTypeDefinition", "fieldsDefinition", 
		"fieldDefinition", "argumentsDefinition", "argumentDefinition", "unionTypeDefinition", 
		"unionMemberTypes", "scalarTypeDefinition", "inputObjectDefinition", "inputValuesDefinition", 
		"inputValueDefinition", "directiveDefinition", "directiveLocations", "directiveLocation", 
		"typeSystemExtension", "schemaExtension", "typeExtension", "objectTypeExtensionDefinition", 
		"interfaceTypeExtensionDefinition", "unionTypeExtensionDefinition", "scalarTypeExtensionDefinition", 
		"enumTypeExtensionDefinition", "inputObjectTypeExtensionDefinition", "name", 
		"type", "namedType", "listType", "nonNullType", "description", "defaultValue", 
		"value", "intValue", "floatValue", "booleanValue", "stringValue", "nullValue", 
		"enumValue", "listValue", "objectValue", "objectField", "directives", 
		"directive", "directiveArguments", "directiveArgument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':'", "'&'", "'('", "')'", "'='", "'|'", "'@'", "'['", 
		"']'", "'!'", "'true'", "'false'", "'null'", "'schema'", "'query'", "'mutation'", 
		"'subscription'", "'enum'", "'type'", "'implements'", "'interface'", "'union'", 
		"'scalar'", "'input'", "'directive'", "'repeatable'", "'on'", "'extend'", 
		null, null, null, null, null, null, "','", null, null, "'\\uEFBBBF'", 
		"'\\uFEFF'", "'\\u0000FEFF'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "SCHEMA", "QUERY", "MUTATION", "SUBSCRIPTION", 
		"ENUM", "TYPE", "IMPLEMENTS", "INTERFACE", "UNION", "SCALAR", "INPUT", 
		"DIRECTIVE", "REPEATABLE", "ON_KEYWORD", "EXTEND", "NAME", "STRING", "BLOCK_STRING", 
		"FLOAT", "INT", "WS", "COMMA", "COMMENT", "UNICODE_BOM", "UTF8_BOM", "UTF16_BOM", 
		"UTF32_BOM"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GraphSDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphSDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public List<SchemaDefinitionContext> schemaDefinition() {
			return getRuleContexts(SchemaDefinitionContext.class);
		}
		public SchemaDefinitionContext schemaDefinition(int i) {
			return getRuleContext(SchemaDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(112);
					schemaDefinition();
					}
					break;
				case 2:
					{
					setState(113);
					typeDefinition();
					}
					break;
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << ENUM) | (1L << TYPE) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << EXTEND) | (1L << STRING) | (1L << BLOCK_STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaDefinitionContext extends ParserRuleContext {
		public TerminalNode SCHEMA() { return getToken(GraphSDLParser.SCHEMA, 0); }
		public OperationTypesDefinitionContext operationTypesDefinition() {
			return getRuleContext(OperationTypesDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public SchemaDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterSchemaDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitSchemaDefinition(this);
		}
	}

	public final SchemaDefinitionContext schemaDefinition() throws RecognitionException {
		SchemaDefinitionContext _localctx = new SchemaDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemaDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(118);
				description();
				}
			}

			setState(121);
			match(SCHEMA);
			setState(123);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(122);
				directives();
				}
			}

			setState(125);
			operationTypesDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTypesDefinitionContext extends ParserRuleContext {
		public List<OperationTypeDefinitionContext> operationTypeDefinition() {
			return getRuleContexts(OperationTypeDefinitionContext.class);
		}
		public OperationTypeDefinitionContext operationTypeDefinition(int i) {
			return getRuleContext(OperationTypeDefinitionContext.class,i);
		}
		public OperationTypesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationTypesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterOperationTypesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitOperationTypesDefinition(this);
		}
	}

	public final OperationTypesDefinitionContext operationTypesDefinition() throws RecognitionException {
		OperationTypesDefinitionContext _localctx = new OperationTypesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operationTypesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__0);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << STRING) | (1L << BLOCK_STRING))) != 0)) {
				{
				{
				setState(128);
				operationTypeDefinition();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTypeDefinitionContext extends ParserRuleContext {
		public OperationTypeContext operationType() {
			return getRuleContext(OperationTypeContext.class,0);
		}
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public OperationTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterOperationTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitOperationTypeDefinition(this);
		}
	}

	public final OperationTypeDefinitionContext operationTypeDefinition() throws RecognitionException {
		OperationTypeDefinitionContext _localctx = new OperationTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operationTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(136);
				description();
				}
			}

			setState(139);
			operationType();
			setState(140);
			match(T__2);
			setState(141);
			namedType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTypeContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(GraphSDLParser.QUERY, 0); }
		public TerminalNode MUTATION() { return getToken(GraphSDLParser.MUTATION, 0); }
		public TerminalNode SUBSCRIPTION() { return getToken(GraphSDLParser.SUBSCRIPTION, 0); }
		public OperationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterOperationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitOperationType(this);
		}
	}

	public final OperationTypeContext operationType() throws RecognitionException {
		OperationTypeContext _localctx = new OperationTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public EnumTypeDefinitionContext enumTypeDefinition() {
			return getRuleContext(EnumTypeDefinitionContext.class,0);
		}
		public ObjectTypeDefinitionContext objectTypeDefinition() {
			return getRuleContext(ObjectTypeDefinitionContext.class,0);
		}
		public InterfaceTypeDefinitionContext interfaceTypeDefinition() {
			return getRuleContext(InterfaceTypeDefinitionContext.class,0);
		}
		public InputObjectDefinitionContext inputObjectDefinition() {
			return getRuleContext(InputObjectDefinitionContext.class,0);
		}
		public UnionTypeDefinitionContext unionTypeDefinition() {
			return getRuleContext(UnionTypeDefinitionContext.class,0);
		}
		public ScalarTypeDefinitionContext scalarTypeDefinition() {
			return getRuleContext(ScalarTypeDefinitionContext.class,0);
		}
		public DirectiveDefinitionContext directiveDefinition() {
			return getRuleContext(DirectiveDefinitionContext.class,0);
		}
		public TypeSystemExtensionContext typeSystemExtension() {
			return getRuleContext(TypeSystemExtensionContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDefinition);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				enumTypeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				objectTypeDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				interfaceTypeDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				inputObjectDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				unionTypeDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				scalarTypeDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				directiveDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				typeSystemExtension();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(GraphSDLParser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EnumValuesDefinitionContext enumValuesDefinition() {
			return getRuleContext(EnumValuesDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public EnumTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterEnumTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitEnumTypeDefinition(this);
		}
	}

	public final EnumTypeDefinitionContext enumTypeDefinition() throws RecognitionException {
		EnumTypeDefinitionContext _localctx = new EnumTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(155);
				description();
				}
			}

			setState(158);
			match(ENUM);
			setState(159);
			name();
			setState(161);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(160);
				directives();
				}
			}

			setState(163);
			enumValuesDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValuesDefinitionContext extends ParserRuleContext {
		public List<EnumValueDefinitionContext> enumValueDefinition() {
			return getRuleContexts(EnumValueDefinitionContext.class);
		}
		public EnumValueDefinitionContext enumValueDefinition(int i) {
			return getRuleContext(EnumValueDefinitionContext.class,i);
		}
		public EnumValuesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValuesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterEnumValuesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitEnumValuesDefinition(this);
		}
	}

	public final EnumValuesDefinitionContext enumValuesDefinition() throws RecognitionException {
		EnumValuesDefinitionContext _localctx = new EnumValuesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumValuesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME) | (1L << STRING) | (1L << BLOCK_STRING))) != 0)) {
				{
				{
				setState(166);
				enumValueDefinition();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public EnumValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterEnumValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitEnumValueDefinition(this);
		}
	}

	public final EnumValueDefinitionContext enumValueDefinition() throws RecognitionException {
		EnumValueDefinitionContext _localctx = new EnumValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(174);
				description();
				}
			}

			setState(177);
			name();
			setState(179);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(178);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GraphSDLParser.TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldsDefinitionContext fieldsDefinition() {
			return getRuleContext(FieldsDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ImplementsInterfacesContext implementsInterfaces() {
			return getRuleContext(ImplementsInterfacesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ObjectTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterObjectTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitObjectTypeDefinition(this);
		}
	}

	public final ObjectTypeDefinitionContext objectTypeDefinition() throws RecognitionException {
		ObjectTypeDefinitionContext _localctx = new ObjectTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(181);
				description();
				}
			}

			setState(184);
			match(TYPE);
			setState(185);
			name();
			setState(187);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(186);
				implementsInterfaces();
				}
			}

			setState(190);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(189);
				directives();
				}
			}

			setState(192);
			fieldsDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsInterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(GraphSDLParser.IMPLEMENTS, 0); }
		public List<ImplementsInterfaceContext> implementsInterface() {
			return getRuleContexts(ImplementsInterfaceContext.class);
		}
		public ImplementsInterfaceContext implementsInterface(int i) {
			return getRuleContext(ImplementsInterfaceContext.class,i);
		}
		public ImplementsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterImplementsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitImplementsInterfaces(this);
		}
	}

	public final ImplementsInterfacesContext implementsInterfaces() throws RecognitionException {
		ImplementsInterfacesContext _localctx = new ImplementsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_implementsInterfaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IMPLEMENTS);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					implementsInterface();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsInterfaceContext extends ParserRuleContext {
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public ImplementsInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterImplementsInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitImplementsInterface(this);
		}
	}

	public final ImplementsInterfaceContext implementsInterface() throws RecognitionException {
		ImplementsInterfaceContext _localctx = new ImplementsInterfaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_implementsInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(201);
				match(T__3);
				}
			}

			setState(204);
			namedType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(GraphSDLParser.INTERFACE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldsDefinitionContext fieldsDefinition() {
			return getRuleContext(FieldsDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ImplementsInterfacesContext implementsInterfaces() {
			return getRuleContext(ImplementsInterfacesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InterfaceTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInterfaceTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInterfaceTypeDefinition(this);
		}
	}

	public final InterfaceTypeDefinitionContext interfaceTypeDefinition() throws RecognitionException {
		InterfaceTypeDefinitionContext _localctx = new InterfaceTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(206);
				description();
				}
			}

			setState(209);
			match(INTERFACE);
			setState(210);
			name();
			setState(212);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(211);
				implementsInterfaces();
				}
			}

			setState(215);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(214);
				directives();
				}
			}

			setState(217);
			fieldsDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsDefinitionContext extends ParserRuleContext {
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public FieldsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterFieldsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitFieldsDefinition(this);
		}
	}

	public final FieldsDefinitionContext fieldsDefinition() throws RecognitionException {
		FieldsDefinitionContext _localctx = new FieldsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__0);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME) | (1L << STRING) | (1L << BLOCK_STRING))) != 0)) {
				{
				{
				setState(220);
				fieldDefinition();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ArgumentsDefinitionContext argumentsDefinition() {
			return getRuleContext(ArgumentsDefinitionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitFieldDefinition(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(228);
				description();
				}
			}

			setState(231);
			name();
			setState(233);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(232);
				argumentsDefinition();
				}
			}

			setState(235);
			match(T__2);
			setState(236);
			type();
			setState(238);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(237);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsDefinitionContext extends ParserRuleContext {
		public List<ArgumentDefinitionContext> argumentDefinition() {
			return getRuleContexts(ArgumentDefinitionContext.class);
		}
		public ArgumentDefinitionContext argumentDefinition(int i) {
			return getRuleContext(ArgumentDefinitionContext.class,i);
		}
		public ArgumentsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterArgumentsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitArgumentsDefinition(this);
		}
	}

	public final ArgumentsDefinitionContext argumentsDefinition() throws RecognitionException {
		ArgumentsDefinitionContext _localctx = new ArgumentsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__4);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME) | (1L << STRING) | (1L << BLOCK_STRING))) != 0)) {
				{
				{
				setState(241);
				argumentDefinition();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ArgumentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterArgumentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitArgumentDefinition(this);
		}
	}

	public final ArgumentDefinitionContext argumentDefinition() throws RecognitionException {
		ArgumentDefinitionContext _localctx = new ArgumentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(249);
				description();
				}
			}

			setState(252);
			name();
			setState(253);
			match(T__2);
			setState(254);
			type();
			setState(256);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(255);
				defaultValue();
				}
			}

			setState(259);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(258);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(GraphSDLParser.UNION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public UnionTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterUnionTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitUnionTypeDefinition(this);
		}
	}

	public final UnionTypeDefinitionContext unionTypeDefinition() throws RecognitionException {
		UnionTypeDefinitionContext _localctx = new UnionTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unionTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(261);
				description();
				}
			}

			setState(264);
			match(UNION);
			setState(265);
			name();
			setState(267);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(266);
				directives();
				}
			}

			setState(269);
			unionMemberTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionMemberTypesContext extends ParserRuleContext {
		public List<NamedTypeContext> namedType() {
			return getRuleContexts(NamedTypeContext.class);
		}
		public NamedTypeContext namedType(int i) {
			return getRuleContext(NamedTypeContext.class,i);
		}
		public UnionMemberTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterUnionMemberTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitUnionMemberTypes(this);
		}
	}

	public final UnionMemberTypesContext unionMemberTypes() throws RecognitionException {
		UnionMemberTypesContext _localctx = new UnionMemberTypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unionMemberTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__6);
			setState(273);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(272);
				match(T__7);
				}
			}

			setState(275);
			namedType();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(276);
				match(T__7);
				setState(277);
				namedType();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(GraphSDLParser.SCALAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ScalarTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterScalarTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitScalarTypeDefinition(this);
		}
	}

	public final ScalarTypeDefinitionContext scalarTypeDefinition() throws RecognitionException {
		ScalarTypeDefinitionContext _localctx = new ScalarTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scalarTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(283);
				description();
				}
			}

			setState(286);
			match(SCALAR);
			setState(287);
			name();
			setState(289);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(288);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputObjectDefinitionContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(GraphSDLParser.INPUT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InputValuesDefinitionContext inputValuesDefinition() {
			return getRuleContext(InputValuesDefinitionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InputObjectDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputObjectDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInputObjectDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInputObjectDefinition(this);
		}
	}

	public final InputObjectDefinitionContext inputObjectDefinition() throws RecognitionException {
		InputObjectDefinitionContext _localctx = new InputObjectDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inputObjectDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(291);
				description();
				}
			}

			setState(294);
			match(INPUT);
			setState(295);
			name();
			setState(297);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(296);
				directives();
				}
			}

			setState(299);
			inputValuesDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputValuesDefinitionContext extends ParserRuleContext {
		public List<InputValueDefinitionContext> inputValueDefinition() {
			return getRuleContexts(InputValueDefinitionContext.class);
		}
		public InputValueDefinitionContext inputValueDefinition(int i) {
			return getRuleContext(InputValueDefinitionContext.class,i);
		}
		public InputValuesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputValuesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInputValuesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInputValuesDefinition(this);
		}
	}

	public final InputValuesDefinitionContext inputValuesDefinition() throws RecognitionException {
		InputValuesDefinitionContext _localctx = new InputValuesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputValuesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME) | (1L << STRING) | (1L << BLOCK_STRING))) != 0)) {
				{
				{
				setState(302);
				inputValueDefinition();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputValueDefinitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InputValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInputValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInputValueDefinition(this);
		}
	}

	public final InputValueDefinitionContext inputValueDefinition() throws RecognitionException {
		InputValueDefinitionContext _localctx = new InputValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inputValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(310);
				description();
				}
			}

			setState(313);
			name();
			setState(314);
			match(T__2);
			setState(315);
			type();
			setState(317);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(316);
				defaultValue();
				}
			}

			setState(320);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(319);
				directives();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveDefinitionContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(GraphSDLParser.DIRECTIVE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ON_KEYWORD() { return getToken(GraphSDLParser.ON_KEYWORD, 0); }
		public DirectiveLocationsContext directiveLocations() {
			return getRuleContext(DirectiveLocationsContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ArgumentsDefinitionContext argumentsDefinition() {
			return getRuleContext(ArgumentsDefinitionContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(GraphSDLParser.REPEATABLE, 0); }
		public DirectiveDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectiveDefinition(this);
		}
	}

	public final DirectiveDefinitionContext directiveDefinition() throws RecognitionException {
		DirectiveDefinitionContext _localctx = new DirectiveDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_directiveDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if (_la==STRING || _la==BLOCK_STRING) {
				{
				setState(322);
				description();
				}
			}

			setState(325);
			match(DIRECTIVE);
			setState(326);
			match(T__8);
			setState(327);
			name();
			setState(329);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(328);
				argumentsDefinition();
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==REPEATABLE) {
				{
				setState(331);
				match(REPEATABLE);
				}
			}

			setState(334);
			match(ON_KEYWORD);
			setState(335);
			directiveLocations(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveLocationsContext extends ParserRuleContext {
		public DirectiveLocationContext directiveLocation() {
			return getRuleContext(DirectiveLocationContext.class,0);
		}
		public DirectiveLocationsContext directiveLocations() {
			return getRuleContext(DirectiveLocationsContext.class,0);
		}
		public DirectiveLocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveLocations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectiveLocations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectiveLocations(this);
		}
	}

	public final DirectiveLocationsContext directiveLocations() throws RecognitionException {
		return directiveLocations(0);
	}

	private DirectiveLocationsContext directiveLocations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectiveLocationsContext _localctx = new DirectiveLocationsContext(_ctx, _parentState);
		DirectiveLocationsContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_directiveLocations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(338);
			directiveLocation();
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectiveLocationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_directiveLocations);
					setState(340);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(341);
					match(T__7);
					setState(342);
					directiveLocation();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DirectiveLocationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DirectiveLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectiveLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectiveLocation(this);
		}
	}

	public final DirectiveLocationContext directiveLocation() throws RecognitionException {
		DirectiveLocationContext _localctx = new DirectiveLocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_directiveLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSystemExtensionContext extends ParserRuleContext {
		public SchemaExtensionContext schemaExtension() {
			return getRuleContext(SchemaExtensionContext.class,0);
		}
		public TypeExtensionContext typeExtension() {
			return getRuleContext(TypeExtensionContext.class,0);
		}
		public TypeSystemExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSystemExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterTypeSystemExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitTypeSystemExtension(this);
		}
	}

	public final TypeSystemExtensionContext typeSystemExtension() throws RecognitionException {
		TypeSystemExtensionContext _localctx = new TypeSystemExtensionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeSystemExtension);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				schemaExtension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				typeExtension();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaExtensionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode SCHEMA() { return getToken(GraphSDLParser.SCHEMA, 0); }
		public OperationTypesDefinitionContext operationTypesDefinition() {
			return getRuleContext(OperationTypesDefinitionContext.class,0);
		}
		public List<DirectivesContext> directives() {
			return getRuleContexts(DirectivesContext.class);
		}
		public DirectivesContext directives(int i) {
			return getRuleContext(DirectivesContext.class,i);
		}
		public SchemaExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterSchemaExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitSchemaExtension(this);
		}
	}

	public final SchemaExtensionContext schemaExtension() throws RecognitionException {
		SchemaExtensionContext _localctx = new SchemaExtensionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_schemaExtension);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(EXTEND);
				setState(355);
				match(SCHEMA);
				setState(357);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(356);
					directives();
					}
				}

				setState(359);
				operationTypesDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(EXTEND);
				setState(361);
				match(SCHEMA);
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(362);
					directives();
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExtensionContext extends ParserRuleContext {
		public ObjectTypeExtensionDefinitionContext objectTypeExtensionDefinition() {
			return getRuleContext(ObjectTypeExtensionDefinitionContext.class,0);
		}
		public InterfaceTypeExtensionDefinitionContext interfaceTypeExtensionDefinition() {
			return getRuleContext(InterfaceTypeExtensionDefinitionContext.class,0);
		}
		public UnionTypeExtensionDefinitionContext unionTypeExtensionDefinition() {
			return getRuleContext(UnionTypeExtensionDefinitionContext.class,0);
		}
		public ScalarTypeExtensionDefinitionContext scalarTypeExtensionDefinition() {
			return getRuleContext(ScalarTypeExtensionDefinitionContext.class,0);
		}
		public EnumTypeExtensionDefinitionContext enumTypeExtensionDefinition() {
			return getRuleContext(EnumTypeExtensionDefinitionContext.class,0);
		}
		public InputObjectTypeExtensionDefinitionContext inputObjectTypeExtensionDefinition() {
			return getRuleContext(InputObjectTypeExtensionDefinitionContext.class,0);
		}
		public TypeExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterTypeExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitTypeExtension(this);
		}
	}

	public final TypeExtensionContext typeExtension() throws RecognitionException {
		TypeExtensionContext _localctx = new TypeExtensionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeExtension);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				objectTypeExtensionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				interfaceTypeExtensionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				unionTypeExtensionDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				scalarTypeExtensionDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				enumTypeExtensionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				inputObjectTypeExtensionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode TYPE() { return getToken(GraphSDLParser.TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldsDefinitionContext fieldsDefinition() {
			return getRuleContext(FieldsDefinitionContext.class,0);
		}
		public ImplementsInterfacesContext implementsInterfaces() {
			return getRuleContext(ImplementsInterfacesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ObjectTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterObjectTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitObjectTypeExtensionDefinition(this);
		}
	}

	public final ObjectTypeExtensionDefinitionContext objectTypeExtensionDefinition() throws RecognitionException {
		ObjectTypeExtensionDefinitionContext _localctx = new ObjectTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectTypeExtensionDefinition);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(EXTEND);
				setState(378);
				match(TYPE);
				setState(379);
				name();
				setState(381);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
					setState(380);
					implementsInterfaces();
					}
				}

				setState(384);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(383);
					directives();
					}
				}

				setState(386);
				fieldsDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(EXTEND);
				setState(389);
				match(TYPE);
				setState(390);
				name();
				setState(392);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
					setState(391);
					implementsInterfaces();
					}
				}

				setState(395);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(394);
					directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode INTERFACE() { return getToken(GraphSDLParser.INTERFACE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldsDefinitionContext fieldsDefinition() {
			return getRuleContext(FieldsDefinitionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InterfaceTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInterfaceTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInterfaceTypeExtensionDefinition(this);
		}
	}

	public final InterfaceTypeExtensionDefinitionContext interfaceTypeExtensionDefinition() throws RecognitionException {
		InterfaceTypeExtensionDefinitionContext _localctx = new InterfaceTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceTypeExtensionDefinition);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(EXTEND);
				setState(400);
				match(INTERFACE);
				setState(401);
				name();
				setState(403);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(402);
					directives();
					}
				}

				setState(405);
				fieldsDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(EXTEND);
				setState(408);
				match(INTERFACE);
				setState(409);
				name();
				setState(411);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(410);
					directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode UNION() { return getToken(GraphSDLParser.UNION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public UnionTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterUnionTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitUnionTypeExtensionDefinition(this);
		}
	}

	public final UnionTypeExtensionDefinitionContext unionTypeExtensionDefinition() throws RecognitionException {
		UnionTypeExtensionDefinitionContext _localctx = new UnionTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unionTypeExtensionDefinition);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(EXTEND);
				setState(416);
				match(UNION);
				setState(417);
				name();
				setState(419);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(418);
					directives();
					}
				}

				setState(421);
				unionMemberTypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(EXTEND);
				setState(424);
				match(UNION);
				setState(425);
				name();
				setState(427);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(426);
					directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode SCALAR() { return getToken(GraphSDLParser.SCALAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public ScalarTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterScalarTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitScalarTypeExtensionDefinition(this);
		}
	}

	public final ScalarTypeExtensionDefinitionContext scalarTypeExtensionDefinition() throws RecognitionException {
		ScalarTypeExtensionDefinitionContext _localctx = new ScalarTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_scalarTypeExtensionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(EXTEND);
			setState(432);
			match(SCALAR);
			setState(433);
			name();
			setState(434);
			directives();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode ENUM() { return getToken(GraphSDLParser.ENUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EnumValuesDefinitionContext enumValuesDefinition() {
			return getRuleContext(EnumValuesDefinitionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public EnumTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterEnumTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitEnumTypeExtensionDefinition(this);
		}
	}

	public final EnumTypeExtensionDefinitionContext enumTypeExtensionDefinition() throws RecognitionException {
		EnumTypeExtensionDefinitionContext _localctx = new EnumTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumTypeExtensionDefinition);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(EXTEND);
				setState(437);
				match(ENUM);
				setState(438);
				name();
				setState(440);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(439);
					directives();
					}
				}

				setState(442);
				enumValuesDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(EXTEND);
				setState(445);
				match(ENUM);
				setState(446);
				name();
				setState(448);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(447);
					directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputObjectTypeExtensionDefinitionContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public TerminalNode INPUT() { return getToken(GraphSDLParser.INPUT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InputValuesDefinitionContext inputValuesDefinition() {
			return getRuleContext(InputValuesDefinitionContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public InputObjectTypeExtensionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputObjectTypeExtensionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterInputObjectTypeExtensionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitInputObjectTypeExtensionDefinition(this);
		}
	}

	public final InputObjectTypeExtensionDefinitionContext inputObjectTypeExtensionDefinition() throws RecognitionException {
		InputObjectTypeExtensionDefinitionContext _localctx = new InputObjectTypeExtensionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inputObjectTypeExtensionDefinition);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(EXTEND);
				setState(453);
				match(INPUT);
				setState(454);
				name();
				setState(456);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(455);
					directives();
					}
				}

				setState(458);
				inputValuesDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(EXTEND);
				setState(461);
				match(INPUT);
				setState(462);
				name();
				setState(464);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(463);
					directives();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GraphSDLParser.NAME, 0); }
		public TerminalNode SCHEMA() { return getToken(GraphSDLParser.SCHEMA, 0); }
		public TerminalNode QUERY() { return getToken(GraphSDLParser.QUERY, 0); }
		public TerminalNode MUTATION() { return getToken(GraphSDLParser.MUTATION, 0); }
		public TerminalNode SUBSCRIPTION() { return getToken(GraphSDLParser.SUBSCRIPTION, 0); }
		public TerminalNode ENUM() { return getToken(GraphSDLParser.ENUM, 0); }
		public TerminalNode TYPE() { return getToken(GraphSDLParser.TYPE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GraphSDLParser.IMPLEMENTS, 0); }
		public TerminalNode INTERFACE() { return getToken(GraphSDLParser.INTERFACE, 0); }
		public TerminalNode UNION() { return getToken(GraphSDLParser.UNION, 0); }
		public TerminalNode SCALAR() { return getToken(GraphSDLParser.SCALAR, 0); }
		public TerminalNode INPUT() { return getToken(GraphSDLParser.INPUT, 0); }
		public TerminalNode DIRECTIVE() { return getToken(GraphSDLParser.DIRECTIVE, 0); }
		public TerminalNode ON_KEYWORD() { return getToken(GraphSDLParser.ON_KEYWORD, 0); }
		public TerminalNode EXTEND() { return getToken(GraphSDLParser.EXTEND, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public NonNullTypeContext nonNullType() {
			return getRuleContext(NonNullTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				namedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				listType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				nonNullType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedTypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterNamedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitNamedType(this);
		}
	}

	public final NamedTypeContext namedType() throws RecognitionException {
		NamedTypeContext _localctx = new NamedTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_namedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitListType(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__9);
			setState(478);
			type();
			setState(479);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonNullTypeContext extends ParserRuleContext {
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public NonNullTypeContext nonNullType() {
			return getRuleContext(NonNullTypeContext.class,0);
		}
		public NonNullTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNullType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterNonNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitNonNullType(this);
		}
	}

	public final NonNullTypeContext nonNullType() throws RecognitionException {
		return nonNullType(0);
	}

	private NonNullTypeContext nonNullType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonNullTypeContext _localctx = new NonNullTypeContext(_ctx, _parentState);
		NonNullTypeContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_nonNullType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			switch (_input.LA(1)) {
			case SCHEMA:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
			case ENUM:
			case TYPE:
			case IMPLEMENTS:
			case INTERFACE:
			case UNION:
			case SCALAR:
			case INPUT:
			case DIRECTIVE:
			case ON_KEYWORD:
			case EXTEND:
			case NAME:
				{
				setState(482);
				namedType();
				setState(483);
				match(T__11);
				}
				break;
			case T__9:
				{
				setState(485);
				listType();
				setState(486);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonNullTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonNullType);
					setState(490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(491);
					match(T__11);
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			stringValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__6);
			setState(500);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public NullValueContext nullValue() {
			return getRuleContext(NullValueContext.class,0);
		}
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ObjectValueContext objectValue() {
			return getRuleContext(ObjectValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_value);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				intValue();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				floatValue();
				}
				break;
			case STRING:
			case BLOCK_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				stringValue();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				booleanValue();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				nullValue();
				}
				break;
			case SCHEMA:
			case QUERY:
			case MUTATION:
			case SUBSCRIPTION:
			case ENUM:
			case TYPE:
			case IMPLEMENTS:
			case INTERFACE:
			case UNION:
			case SCALAR:
			case INPUT:
			case DIRECTIVE:
			case ON_KEYWORD:
			case EXTEND:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				enumValue();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(508);
				listValue();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 8);
				{
				setState(509);
				objectValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GraphSDLParser.INT, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitIntValue(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatValueContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(GraphSDLParser.FLOAT, 0); }
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitFloatValue(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_floatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitBooleanValue(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GraphSDLParser.STRING, 0); }
		public TerminalNode BLOCK_STRING() { return getToken(GraphSDLParser.BLOCK_STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitStringValue(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stringValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==BLOCK_STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueContext extends ParserRuleContext {
		public NullValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitNullValue(this);
		}
	}

	public final NullValueContext nullValue() throws RecognitionException {
		NullValueContext _localctx = new NullValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_nullValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListValueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitListValue(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_listValue);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(T__9);
				setState(525);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(T__9);
				setState(528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(527);
					value();
					}
					}
					setState(530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME) | (1L << STRING) | (1L << BLOCK_STRING) | (1L << FLOAT) | (1L << INT))) != 0) );
				setState(532);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectValueContext extends ParserRuleContext {
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public ObjectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitObjectValue(this);
		}
	}

	public final ObjectValueContext objectValue() throws RecognitionException {
		ObjectValueContext _localctx = new ObjectValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_objectValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__0);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME))) != 0)) {
				{
				{
				setState(537);
				objectField();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectFieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitObjectField(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_objectField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			name();
			setState(546);
			match(T__2);
			setState(547);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectivesContext extends ParserRuleContext {
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(549);
					directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DirectiveArgumentsContext directiveArguments() {
			return getRuleContext(DirectiveArgumentsContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__8);
			setState(555);
			name();
			setState(557);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(556);
				directiveArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArgumentsContext extends ParserRuleContext {
		public List<DirectiveArgumentContext> directiveArgument() {
			return getRuleContexts(DirectiveArgumentContext.class);
		}
		public DirectiveArgumentContext directiveArgument(int i) {
			return getRuleContext(DirectiveArgumentContext.class,i);
		}
		public DirectiveArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectiveArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectiveArguments(this);
		}
	}

	public final DirectiveArgumentsContext directiveArguments() throws RecognitionException {
		DirectiveArgumentsContext _localctx = new DirectiveArgumentsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(T__4);
			setState(561); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(560);
				directiveArgument();
				}
				}
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHEMA) | (1L << QUERY) | (1L << MUTATION) | (1L << SUBSCRIPTION) | (1L << ENUM) | (1L << TYPE) | (1L << IMPLEMENTS) | (1L << INTERFACE) | (1L << UNION) | (1L << SCALAR) | (1L << INPUT) | (1L << DIRECTIVE) | (1L << ON_KEYWORD) | (1L << EXTEND) | (1L << NAME))) != 0) );
			setState(565);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DirectiveArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).enterDirectiveArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSDLListener ) ((GraphSDLListener)listener).exitDirectiveArgument(this);
		}
	}

	public final DirectiveArgumentContext directiveArgument() throws RecognitionException {
		DirectiveArgumentContext _localctx = new DirectiveArgumentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_directiveArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			name();
			setState(568);
			match(T__2);
			setState(569);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return directiveLocations_sempred((DirectiveLocationsContext)_localctx, predIndex);
		case 39:
			return nonNullType_sempred((NonNullTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directiveLocations_sempred(DirectiveLocationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nonNullType_sempred(NonNullTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u023e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\6\2u\n\2\r\2\16"+
		"\2v\3\3\5\3z\n\3\3\3\3\3\5\3~\n\3\3\3\3\3\3\4\3\4\7\4\u0084\n\4\f\4\16"+
		"\4\u0087\13\4\3\4\3\4\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\5\b\u009f\n\b\3\b\3\b\3\b"+
		"\5\b\u00a4\n\b\3\b\3\b\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\t\3"+
		"\t\3\n\5\n\u00b2\n\n\3\n\3\n\5\n\u00b6\n\n\3\13\5\13\u00b9\n\13\3\13\3"+
		"\13\3\13\5\13\u00be\n\13\3\13\5\13\u00c1\n\13\3\13\3\13\3\f\3\f\7\f\u00c7"+
		"\n\f\f\f\16\f\u00ca\13\f\3\r\5\r\u00cd\n\r\3\r\3\r\3\16\5\16\u00d2\n\16"+
		"\3\16\3\16\3\16\5\16\u00d7\n\16\3\16\5\16\u00da\n\16\3\16\3\16\3\17\3"+
		"\17\7\17\u00e0\n\17\f\17\16\17\u00e3\13\17\3\17\3\17\3\20\5\20\u00e8\n"+
		"\20\3\20\3\20\5\20\u00ec\n\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21"+
		"\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3\21\3\21\3\22\5\22\u00fd\n\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0103\n\22\3\22\5\22\u0106\n\22\3\23\5\23\u0109"+
		"\n\23\3\23\3\23\3\23\5\23\u010e\n\23\3\23\3\23\3\24\3\24\5\24\u0114\n"+
		"\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\25\5\25\u011f"+
		"\n\25\3\25\3\25\3\25\5\25\u0124\n\25\3\26\5\26\u0127\n\26\3\26\3\26\3"+
		"\26\5\26\u012c\n\26\3\26\3\26\3\27\3\27\7\27\u0132\n\27\f\27\16\27\u0135"+
		"\13\27\3\27\3\27\3\30\5\30\u013a\n\30\3\30\3\30\3\30\3\30\5\30\u0140\n"+
		"\30\3\30\5\30\u0143\n\30\3\31\5\31\u0146\n\31\3\31\3\31\3\31\3\31\5\31"+
		"\u014c\n\31\3\31\5\31\u014f\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u015a\n\32\f\32\16\32\u015d\13\32\3\33\3\33\3\34\3\34\5"+
		"\34\u0163\n\34\3\35\3\35\3\35\5\35\u0168\n\35\3\35\3\35\3\35\3\35\6\35"+
		"\u016e\n\35\r\35\16\35\u016f\5\35\u0172\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u017a\n\36\3\37\3\37\3\37\3\37\5\37\u0180\n\37\3\37\5\37\u0183"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u018b\n\37\3\37\5\37\u018e\n"+
		"\37\5\37\u0190\n\37\3 \3 \3 \3 \5 \u0196\n \3 \3 \3 \3 \3 \3 \5 \u019e"+
		"\n \5 \u01a0\n \3!\3!\3!\3!\5!\u01a6\n!\3!\3!\3!\3!\3!\3!\5!\u01ae\n!"+
		"\5!\u01b0\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01bb\n#\3#\3#\3#\3#\3"+
		"#\3#\5#\u01c3\n#\5#\u01c5\n#\3$\3$\3$\3$\5$\u01cb\n$\3$\3$\3$\3$\3$\3"+
		"$\5$\u01d3\n$\5$\u01d5\n$\3%\3%\3&\3&\3&\5&\u01dc\n&\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\5)\u01eb\n)\3)\3)\7)\u01ef\n)\f)\16)\u01f2\13"+
		")\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0201\n,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\6\63\u0213\n\63\r"+
		"\63\16\63\u0214\3\63\3\63\5\63\u0219\n\63\3\64\3\64\7\64\u021d\n\64\f"+
		"\64\16\64\u0220\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\6\66\u0229\n"+
		"\66\r\66\16\66\u022a\3\67\3\67\3\67\5\67\u0230\n\67\38\38\68\u0234\n8"+
		"\r8\168\u0235\38\38\39\39\39\39\39\2\4\62P:\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\6\3"+
		"\2\23\25\4\2\22\35\37!\3\2\17\20\3\2\"#\u0262\2t\3\2\2\2\4y\3\2\2\2\6"+
		"\u0081\3\2\2\2\b\u008b\3\2\2\2\n\u0091\3\2\2\2\f\u009b\3\2\2\2\16\u009e"+
		"\3\2\2\2\20\u00a7\3\2\2\2\22\u00b1\3\2\2\2\24\u00b8\3\2\2\2\26\u00c4\3"+
		"\2\2\2\30\u00cc\3\2\2\2\32\u00d1\3\2\2\2\34\u00dd\3\2\2\2\36\u00e7\3\2"+
		"\2\2 \u00f2\3\2\2\2\"\u00fc\3\2\2\2$\u0108\3\2\2\2&\u0111\3\2\2\2(\u011e"+
		"\3\2\2\2*\u0126\3\2\2\2,\u012f\3\2\2\2.\u0139\3\2\2\2\60\u0145\3\2\2\2"+
		"\62\u0153\3\2\2\2\64\u015e\3\2\2\2\66\u0162\3\2\2\28\u0171\3\2\2\2:\u0179"+
		"\3\2\2\2<\u018f\3\2\2\2>\u019f\3\2\2\2@\u01af\3\2\2\2B\u01b1\3\2\2\2D"+
		"\u01c4\3\2\2\2F\u01d4\3\2\2\2H\u01d6\3\2\2\2J\u01db\3\2\2\2L\u01dd\3\2"+
		"\2\2N\u01df\3\2\2\2P\u01ea\3\2\2\2R\u01f3\3\2\2\2T\u01f5\3\2\2\2V\u0200"+
		"\3\2\2\2X\u0202\3\2\2\2Z\u0204\3\2\2\2\\\u0206\3\2\2\2^\u0208\3\2\2\2"+
		"`\u020a\3\2\2\2b\u020c\3\2\2\2d\u0218\3\2\2\2f\u021a\3\2\2\2h\u0223\3"+
		"\2\2\2j\u0228\3\2\2\2l\u022c\3\2\2\2n\u0231\3\2\2\2p\u0239\3\2\2\2ru\5"+
		"\4\3\2su\5\f\7\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\3"+
		"\3\2\2\2xz\5R*\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\22\2\2|~\5j\66\2}|"+
		"\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\6\4\2\u0080\5\3\2\2\2\u0081"+
		"\u0085\7\3\2\2\u0082\u0084\5\b\5\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7\4\2\2\u0089\7\3\2\2\2\u008a\u008c\5R*\2\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\n"+
		"\6\2\u008e\u008f\7\5\2\2\u008f\u0090\5L\'\2\u0090\t\3\2\2\2\u0091\u0092"+
		"\t\2\2\2\u0092\13\3\2\2\2\u0093\u009c\5\16\b\2\u0094\u009c\5\24\13\2\u0095"+
		"\u009c\5\32\16\2\u0096\u009c\5*\26\2\u0097\u009c\5$\23\2\u0098\u009c\5"+
		"(\25\2\u0099\u009c\5\60\31\2\u009a\u009c\5\66\34\2\u009b\u0093\3\2\2\2"+
		"\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097"+
		"\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\r\3\2\2\2\u009d\u009f\5R*\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7\26\2\2\u00a1\u00a3\5H%\2\u00a2\u00a4\5j\66"+
		"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\5\20\t\2\u00a6\17\3\2\2\2\u00a7\u00ab\7\3\2\2\u00a8\u00aa\5\22\n\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\4\2\2\u00af"+
		"\21\3\2\2\2\u00b0\u00b2\5R*\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b5\5H%\2\u00b4\u00b6\5j\66\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b9\5R*\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\27"+
		"\2\2\u00bb\u00bd\5H%\2\u00bc\u00be\5\26\f\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\5j\66\2\u00c0\u00bf\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\34\17\2\u00c3"+
		"\25\3\2\2\2\u00c4\u00c8\7\30\2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\27\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\6\2\2\u00cc\u00cb\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5L\'\2\u00cf\31"+
		"\3\2\2\2\u00d0\u00d2\5R*\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d6\5H%\2\u00d5\u00d7\5\26"+
		"\f\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00da\5j\66\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\5\34\17\2\u00dc\33\3\2\2\2\u00dd\u00e1\7\3\2\2\u00de"+
		"\u00e0\5\36\20\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\35\3\2\2\2\u00e6\u00e8\5R*\2\u00e7\u00e6\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\5H%\2\u00ea\u00ec"+
		"\5 \21\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\7\5\2\2\u00ee\u00f0\5J&\2\u00ef\u00f1\5j\66\2\u00f0\u00ef\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f6\7\7\2\2\u00f3\u00f5"+
		"\5\"\22\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\7\b\2\2\u00fa!\3\2\2\2\u00fb\u00fd\5R*\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\5H%\2\u00ff\u0100\7\5\2\2\u0100"+
		"\u0102\5J&\2\u0101\u0103\5T+\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0105\3\2\2\2\u0104\u0106\5j\66\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106#\3\2\2\2\u0107\u0109\5R*\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\32\2\2\u010b\u010d\5H%\2\u010c"+
		"\u010e\5j\66\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\5&\24\2\u0110%\3\2\2\2\u0111\u0113\7\t\2\2\u0112\u0114"+
		"\7\n\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u011a\5L\'\2\u0116\u0117\7\n\2\2\u0117\u0119\5L\'\2\u0118\u0116\3\2\2"+
		"\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\'"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5R*\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\33\2\2\u0121\u0123\5"+
		"H%\2\u0122\u0124\5j\66\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		")\3\2\2\2\u0125\u0127\5R*\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\7\34\2\2\u0129\u012b\5H%\2\u012a\u012c\5j\66"+
		"\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\5,\27\2\u012e+\3\2\2\2\u012f\u0133\7\3\2\2\u0130\u0132\5.\30\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\4\2\2\u0137"+
		"-\3\2\2\2\u0138\u013a\5R*\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\5H%\2\u013c\u013d\7\5\2\2\u013d\u013f\5J&\2"+
		"\u013e\u0140\5T+\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"+
		"\3\2\2\2\u0141\u0143\5j\66\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"/\3\2\2\2\u0144\u0146\5R*\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\7\35\2\2\u0148\u0149\7\13\2\2\u0149\u014b\5"+
		"H%\2\u014a\u014c\5 \21\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014f\7\36\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\37\2\2\u0151\u0152\5\62\32\2"+
		"\u0152\61\3\2\2\2\u0153\u0154\b\32\1\2\u0154\u0155\5\64\33\2\u0155\u015b"+
		"\3\2\2\2\u0156\u0157\f\3\2\2\u0157\u0158\7\n\2\2\u0158\u015a\5\64\33\2"+
		"\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\63\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5H%\2\u015f"+
		"\65\3\2\2\2\u0160\u0163\58\35\2\u0161\u0163\5:\36\2\u0162\u0160\3\2\2"+
		"\2\u0162\u0161\3\2\2\2\u0163\67\3\2\2\2\u0164\u0165\7 \2\2\u0165\u0167"+
		"\7\22\2\2\u0166\u0168\5j\66\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u0172\5\6\4\2\u016a\u016b\7 \2\2\u016b\u016d"+
		"\7\22\2\2\u016c\u016e\5j\66\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0164"+
		"\3\2\2\2\u0171\u016a\3\2\2\2\u01729\3\2\2\2\u0173\u017a\5<\37\2\u0174"+
		"\u017a\5> \2\u0175\u017a\5@!\2\u0176\u017a\5B\"\2\u0177\u017a\5D#\2\u0178"+
		"\u017a\5F$\2\u0179\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2"+
		"\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a;"+
		"\3\2\2\2\u017b\u017c\7 \2\2\u017c\u017d\7\27\2\2\u017d\u017f\5H%\2\u017e"+
		"\u0180\5\26\f\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3"+
		"\2\2\2\u0181\u0183\5j\66\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\5\34\17\2\u0185\u0190\3\2\2\2\u0186\u0187\7"+
		" \2\2\u0187\u0188\7\27\2\2\u0188\u018a\5H%\2\u0189\u018b\5\26\f\2\u018a"+
		"\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5j"+
		"\66\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u017b\3\2\2\2\u018f\u0186\3\2\2\2\u0190=\3\2\2\2\u0191\u0192\7 \2\2\u0192"+
		"\u0193\7\31\2\2\u0193\u0195\5H%\2\u0194\u0196\5j\66\2\u0195\u0194\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5\34\17\2\u0198"+
		"\u01a0\3\2\2\2\u0199\u019a\7 \2\2\u019a\u019b\7\31\2\2\u019b\u019d\5H"+
		"%\2\u019c\u019e\5j\66\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u0191\3\2\2\2\u019f\u0199\3\2\2\2\u01a0?\3\2\2\2"+
		"\u01a1\u01a2\7 \2\2\u01a2\u01a3\7\32\2\2\u01a3\u01a5\5H%\2\u01a4\u01a6"+
		"\5j\66\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\5&\24\2\u01a8\u01b0\3\2\2\2\u01a9\u01aa\7 \2\2\u01aa\u01ab\7\32"+
		"\2\2\u01ab\u01ad\5H%\2\u01ac\u01ae\5j\66\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01a1\3\2\2\2\u01af\u01a9\3\2\2\2\u01b0"+
		"A\3\2\2\2\u01b1\u01b2\7 \2\2\u01b2\u01b3\7\33\2\2\u01b3\u01b4\5H%\2\u01b4"+
		"\u01b5\5j\66\2\u01b5C\3\2\2\2\u01b6\u01b7\7 \2\2\u01b7\u01b8\7\26\2\2"+
		"\u01b8\u01ba\5H%\2\u01b9\u01bb\5j\66\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5\20\t\2\u01bd\u01c5\3\2\2\2"+
		"\u01be\u01bf\7 \2\2\u01bf\u01c0\7\26\2\2\u01c0\u01c2\5H%\2\u01c1\u01c3"+
		"\5j\66\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01b6\3\2\2\2\u01c4\u01be\3\2\2\2\u01c5E\3\2\2\2\u01c6\u01c7\7 \2\2\u01c7"+
		"\u01c8\7\34\2\2\u01c8\u01ca\5H%\2\u01c9\u01cb\5j\66\2\u01ca\u01c9\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5,\27\2\u01cd"+
		"\u01d5\3\2\2\2\u01ce\u01cf\7 \2\2\u01cf\u01d0\7\34\2\2\u01d0\u01d2\5H"+
		"%\2\u01d1\u01d3\5j\66\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01c6\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d5G\3\2\2\2"+
		"\u01d6\u01d7\t\3\2\2\u01d7I\3\2\2\2\u01d8\u01dc\5L\'\2\u01d9\u01dc\5N"+
		"(\2\u01da\u01dc\5P)\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da"+
		"\3\2\2\2\u01dcK\3\2\2\2\u01dd\u01de\5H%\2\u01deM\3\2\2\2\u01df\u01e0\7"+
		"\f\2\2\u01e0\u01e1\5J&\2\u01e1\u01e2\7\r\2\2\u01e2O\3\2\2\2\u01e3\u01e4"+
		"\b)\1\2\u01e4\u01e5\5L\'\2\u01e5\u01e6\7\16\2\2\u01e6\u01eb\3\2\2\2\u01e7"+
		"\u01e8\5N(\2\u01e8\u01e9\7\16\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e3\3\2"+
		"\2\2\u01ea\u01e7\3\2\2\2\u01eb\u01f0\3\2\2\2\u01ec\u01ed\f\3\2\2\u01ed"+
		"\u01ef\7\16\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1Q\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4"+
		"\5^\60\2\u01f4S\3\2\2\2\u01f5\u01f6\7\t\2\2\u01f6\u01f7\5V,\2\u01f7U\3"+
		"\2\2\2\u01f8\u0201\5X-\2\u01f9\u0201\5Z.\2\u01fa\u0201\5^\60\2\u01fb\u0201"+
		"\5\\/\2\u01fc\u0201\5`\61\2\u01fd\u0201\5b\62\2\u01fe\u0201\5d\63\2\u01ff"+
		"\u0201\5f\64\2\u0200\u01f8\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fa\3\2"+
		"\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201W\3\2\2\2\u0202\u0203\7%\2\2\u0203"+
		"Y\3\2\2\2\u0204\u0205\7$\2\2\u0205[\3\2\2\2\u0206\u0207\t\4\2\2\u0207"+
		"]\3\2\2\2\u0208\u0209\t\5\2\2\u0209_\3\2\2\2\u020a\u020b\7\21\2\2\u020b"+
		"a\3\2\2\2\u020c\u020d\5H%\2\u020dc\3\2\2\2\u020e\u020f\7\f\2\2\u020f\u0219"+
		"\7\r\2\2\u0210\u0212\7\f\2\2\u0211\u0213\5V,\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0217\7\r\2\2\u0217\u0219\3\2\2\2\u0218\u020e\3\2\2\2\u0218"+
		"\u0210\3\2\2\2\u0219e\3\2\2\2\u021a\u021e\7\3\2\2\u021b\u021d\5h\65\2"+
		"\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\4\2\2\u0222"+
		"g\3\2\2\2\u0223\u0224\5H%\2\u0224\u0225\7\5\2\2\u0225\u0226\5V,\2\u0226"+
		"i\3\2\2\2\u0227\u0229\5l\67\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bk\3\2\2\2\u022c\u022d\7"+
		"\13\2\2\u022d\u022f\5H%\2\u022e\u0230\5n8\2\u022f\u022e\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230m\3\2\2\2\u0231\u0233\7\7\2\2\u0232\u0234\5p9\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7\b\2\2\u0238o\3\2\2\2\u0239\u023a"+
		"\5H%\2\u023a\u023b\7\5\2\2\u023b\u023c\5V,\2\u023cq\3\2\2\2Ntvy}\u0085"+
		"\u008b\u009b\u009e\u00a3\u00ab\u00b1\u00b5\u00b8\u00bd\u00c0\u00c8\u00cc"+
		"\u00d1\u00d6\u00d9\u00e1\u00e7\u00eb\u00f0\u00f6\u00fc\u0102\u0105\u0108"+
		"\u010d\u0113\u011a\u011e\u0123\u0126\u012b\u0133\u0139\u013f\u0142\u0145"+
		"\u014b\u014e\u015b\u0162\u0167\u016f\u0171\u0179\u017f\u0182\u018a\u018d"+
		"\u018f\u0195\u019d\u019f\u01a5\u01ad\u01af\u01ba\u01c2\u01c4\u01ca\u01d2"+
		"\u01d4\u01db\u01ea\u01f0\u0200\u0214\u0218\u021e\u022a\u022f\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}