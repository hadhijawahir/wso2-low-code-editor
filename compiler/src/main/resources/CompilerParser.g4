parser grammar CompilerParser;

options {
    language = Java;
    tokenVocab = CompilerLexer;
}

compilationUnit
    : (publisher | subscriber)*
    ;

publisher
    :  PUBLISHER LEFT_BRACE (keyValuePair* (COMMA keyValuePair)*)? RIGHT_BRACE SEMICOLON
    ;

subscriber
    :  SUBSCRIBER LEFT_BRACE (keyValuePair* (COMMA keyValuePair)*)? RIGHT_BRACE SEMICOLON
    ;

keyValuePair
    : IDENTIFIER COLON primitive SEMICOLON
    ;

primitive
    : string
    | bool
    ;

string
    : SINGLE_STRING
    | DOUBLE_STRING
    ;

bool
    : TRUE
    | FALSE
    ;
