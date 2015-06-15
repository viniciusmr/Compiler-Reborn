/**
 * Define a gramática L linha
 */
grammar LLinha;

programa  : ENDLINE* comandos FIM ENDLINE* EOF;
FIM: 'fim';
         // match keyword hello followed by an identifier

comandos  :  comando (ENDLINE comandos)* ENDLINE* ;

comando 
: SE condicao ENTAO comandos FIM_SE
| SE condicao ENTAO comandos SENAO comandos FIM_SE
| WHILE condicao DO comandos END_WHILE
| FOR ID FROM NUMERO TO NUMERO DO comandos END_FOR
| ID '=' condicao
| vetor '=' condicao 
| FUNC ID'('params')' comandos END_FUNC
| dclvetor;


condicao : condicao and expressao 
| condicao or expressao
| condicao '==' expressao
| condicao dif expressao
| condicao '<' expressao
| condicao menori expressao
| condicao '>' expressao
| condicao maiori expressao
| expressao
;

expressao : expressao '+' expressaoprec 
| expressao '-' expressaoprec 
| expressaoprec;

expressaoprec : '('expressao')'
| expressaoprec div expressaoprec
| expressaoprec mult expressaoprec
| termo;


termo : '(' condicao ')'
| ID
| vetor
| NUMERO
| DECIMAL
| 'verdadeiro'
| 'falso'
| ID'('params')'
| STRING
;


vetor 
: ID ('['condicao']')+;


dclvetor: vetor ID ('['NUMERO']')+ ;

params: condicao (',' params)* ;


DECIMAL: NUMERO [,.] NUMERO+;
NUMERO : ('0'..'9')+;

STRING: '\"' (~["])* '\"' ;

DO : 'faca';
FROM : 'de';
TO : 'ate';
FOR : 'para';
END_FOR : 'fim-para';
WHILE : 'enquanto';
END_WHILE : 'fim-enquanto';
ENTAO : 'entao';//[\n]*;
SE : 'se';
FIM_SE : 'fim-se';
SENAO : 'senao';
FUNC: 'funcao';
END_FUNC: 'fim-funcao';
and: 'e';
or: 'ou';

ID : [a-zA-Z] [a-zA-Z0-9_]* ;
ENDLINE: [\r\n] ;//-> skip ;
WS : [ \t\f]+  -> skip ; // skip spaces, tabs, newlines
COMMENTS : '#' ~[#]* '#' -> skip ; // comentários


dif: '!=' | '=!';
menori: '<=' | '=<';
maiori: '>=' | '=>';
mult: '*'|'x';
div: ':'|'/';

//ErrorCharacter : . ;
//OTHER : . -> skip ;
//handle characters which failed to match any other token
