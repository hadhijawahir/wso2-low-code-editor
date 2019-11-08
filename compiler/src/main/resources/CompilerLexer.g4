lexer grammar CompilerLexer;

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

PUBLISHER           : 'publisher';
SUBSCRIBER          : 'subscriber';

TRUE                : 'true';
FALSE               : 'false';

IDENTIFIER
                    :   [A-Za-z0-9_-]+
                    ;

WS
                    :   [ \t\r\n]+ -> skip
                    ;
