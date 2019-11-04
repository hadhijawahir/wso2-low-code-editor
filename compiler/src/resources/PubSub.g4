grammar PubSub;

compilationUnit
    : (natP | natS)*
    ;

natP
    :  NATP LEFT_BRACE (keyValuePair* (',' keyValuePair)*)? RIGHT_BRACE SEMICOLON
    ;

natS
    :  NATS LEFT_BRACE (keyValuePair* (',' keyValuePair)*)? RIGHT_BRACE SEMICOLON
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
    : 'true'
    | 'false'
    ;

// Separators

SEMICOLON           : ';' ;
COLON               : ':' ;
DOT                 : '.' ;
COMMA               : ',' ;
LEFT_BRACE          : '{' ;
RIGHT_BRACE         : '}' ;

SINGLE_STRING
    : '\'' ~('\'')+ '\''
    ;

DOUBLE_STRING
    : '"' ~('"')+ '"'
    ;

NATP : 'natP';
NATS : 'natS';

IDENTIFIER
    :   [A-Za-z0-9_-]+
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;


/*
natP {
    url : "localhost:4222";
    topic : "topic-1";
    message : "message-1";
};

natS {
    url : "localhost:4222";
    topic : "topic-1";
};
*/