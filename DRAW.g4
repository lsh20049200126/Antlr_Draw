grammar DRAW;


program: statement*  EOF  ;

statement 
	:FOR T FROM expr TO expr STEP expr DRAW L_BACK expr COMMA expr R_BACK SEMICO #FOR

	|ORIGIN IS L_BACK expr COMMA expr R_BACK SEMICO                              #ORIGIN

	|SCALE IS L_BACK expr COMMA expr R_BACK SEMICO                               #SCALE

	|ROT IS expr SEMICO                                                          #ROT

	|COLOR IS L_BACK expr COMMA expr COMMA expr R_BACK SEMICO                    #COLOR

	|SIZE IS expr SEMICO                                                         #SIZE
	;


expr:
    <assoc = right> expr POWER expr       #POWER
    |MINUS expr                           #MINUS1
    |PLUS expr                            #PLUS1
    |expr MUL expr                        #MUL
    |expr DIV expr                        #DIV
    |expr PLUS expr                       #PLUS
    |expr MINUS expr                      #MINUS
    |T                                    #T
    |CONST                                #CONST
    | L_BACK expr R_BACK                  #LRBACK
    |FUNC L_BACK expr R_BACK              #FUNC
    |ERROR                                #ERROR
    ;

SEMICO: ';';
COMMA:  ',';
L_BACK: '(';
R_BACK: ')';
PLUS:   '+';
MINUS:  '-';
MUL:    '*';
DIV:    '/';
POWER:  '**';
 
FOR: [fF][oO][rR];
FROM: [fF][rR][oO][mM];
STEP: [sS][tT][eE][pP];
CONST: [0-9]+('.'[0-9]+)?|[pP][iI]|[eE];
COLOR: [cC][oO][lL][oO][rR];
ORIGIN: [oO][rR][iI][Gg][iI][nN];
IS: [iI][sS];
SIZE: [sS][iI][zZ][eE];
TO: [tT][oO];
DRAW: [dD][rR][aA][wW];
SCALE: [Ss][cC][Aa][lL][eE];
ROT: [rR][oO][tT];

COMMENT :
        ( '//' ~[\r\n]*
        | '--' ~[\r\n]*
        | '/*' .*? '*/'
        ) -> skip
        ;

FUNC: 'sin'|'cos'|'tan'|'ln'|'exp'|'sqrt';

T: [tT];
ID: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;

ERROR: .; 