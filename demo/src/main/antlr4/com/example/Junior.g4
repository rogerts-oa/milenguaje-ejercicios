grammar Junior;

// Programa completo: se exige EOF para no aceptar solo un prefijo válido.
program : HAUS TEXTWERT block EOF ;
block : BLOCKGRENZE statement* BLOCKGRENZE ;
statement
    : roomDeclaration | variableDeclaration | assignment | decision | repetition
    | automation | deviceAction | notification
    ;

// Habitaciones y dispositivos constituyen la organización propia de Junior.
roomDeclaration : ZIMMER KENNUNG BLOCKGRENZE deviceDeclaration* BLOCKGRENZE ;
deviceDeclaration : GERAET KENNUNG DOPPELPUNKT deviceKind ANWEISUNGSENDE ;
deviceKind : LICHT | SENSOR | KLIMA | TUER | ALARM | HAUSHALTSGERAET ;
variableDeclaration : WERT dataType KENNUNG (ZUWEISUNG expression)? ANWEISUNGSENDE ;
dataType : PEGEL | MELDUNG | SCHALTZUSTAND | ZEITPUNKT ;
assignment : SETZEN KENNUNG ZUWEISUNG expression ANWEISUNGSENDE ;

// Tres caminos obligatorios: primero, alternativo condicionado y reserva.
decision : LAGE GRUPPENGRENZE expression GRUPPENGRENZE block
           ZWEIG GRUPPENGRENZE expression GRUPPENGRENZE block ERSATZWEG block ;
repetition : REGELKREIS GRUPPENGRENZE expression GRUPPENGRENZE block ;

// Eventos de dispositivos o coincidencia del reloj con un horario válido.
automation : BEI_EREIGNIS eventSource block ;
eventSource : deviceReference PUNKT eventKind (comparison expression)?
            | UHR PUNKT ZEITEREIGNIS GLEICH UHRZEITWERT ;
eventKind : BEWEGUNG | GEOEFFNET | GESCHLOSSEN | WARNUNG | TEMPERATUR ;
comparison : GLEICH | UNGLEICH | GROESSER | KLEINER | GROESSER_GLEICH | KLEINER_GLEICH ;
deviceReference : KENNUNG PUNKT KENNUNG ;
// ^...^ agrupa uno o más destinos; no introduce un quinto tipo de datos.
deviceAction : (EINSCHALTEN | AUSSCHALTEN) targets ANWEISUNGSENDE ;
targets : deviceReference | LISTENGRENZE deviceReference (KOMMA deviceReference)* LISTENGRENZE ;
notification : MELDEN expression ANWEISUNGSENDE ;

// Precedencia de menor a mayor; bucles binarios asocian a la izquierda.
expression : logicalOr ;
logicalOr : logicalAnd (ODER logicalAnd)* ;
logicalAnd : equality (UND equality)* ;
equality : relational ((GLEICH | UNGLEICH) relational)* ;
relational : additive ((KLEINER | KLEINER_GLEICH | GROESSER | GROESSER_GLEICH) additive)* ;
additive : multiplicative ((ADDITION | SUBTRAKTION) multiplicative)* ;
multiplicative : unary ((MULTIPLIKATION | DIVISION) unary)* ;
unary : (NICHT | SUBTRAKTION | ADDITION) unary | primary ;
primary : ZAHL | TEXTWERT | UHRZEITWERT | AN | AUS
        | reference | GRUPPENGRENZE expression GRUPPENGRENZE ;
reference : KENNUNG (PUNKT KENNUNG)* | UHR PUNKT ZEITEREIGNIS ;

// Lexemas de la tabla del equipo y alias en mayúscula; no mezclas arbitrarias.
HAUS : 'haus' | 'HAUS' ;
ZIMMER : 'zimmer' | 'ZIMMER' ;
GERAET : 'geraet' | 'GERAET' ;
WERT : 'wert' | 'WERT' ;
SETZEN : 'setzen' | 'SETZEN' ;
BEI_EREIGNIS : 'beiEreignis' | 'BEIEREIGNIS' ;
LAGE : 'lage' | 'LAGE' ;
ZWEIG : 'zweig' | 'ZWEIG' ;
ERSATZWEG : 'ersatzweg' | 'ERSATZWEG' ;
REGELKREIS : 'regelkreis' | 'REGELKREIS' ;
EINSCHALTEN : 'einschalten' | 'EINSCHALTEN' ;
AUSSCHALTEN : 'ausschalten' | 'AUSSCHALTEN' ;
MELDEN : 'melden' | 'MELDEN' ;
PEGEL : 'pegel' | 'PEGEL' ;
MELDUNG : 'meldung' | 'MELDUNG' ;
SCHALTZUSTAND : 'schaltzustand' | 'SCHALTZUSTAND' ;
ZEITPUNKT : 'zeitpunkt' | 'ZEITPUNKT' ;
AN : 'an' | 'AN' ;
AUS : 'aus' | 'AUS' ;
LICHT : 'licht' | 'LICHT' ;
SENSOR : 'sensor' | 'SENSOR' ;
KLIMA : 'klima' | 'KLIMA' ;
TUER : 'tuer' | 'TUER' ;
ALARM : 'alarm' | 'ALARM' ;
HAUSHALTSGERAET : 'haushaltsgeraet' | 'HAUSHALTSGERAET' ;
UHR : 'uhr' | 'UHR' ;
BEWEGUNG : 'bewegung' | 'BEWEGUNG' ;
GEOEFFNET : 'geoeffnet' | 'GEOEFFNET' ;
GESCHLOSSEN : 'geschlossen' | 'GESCHLOSSEN' ;
WARNUNG : 'warnung' | 'WARNUNG' ;
TEMPERATUR : 'temperatur' | 'TEMPERATUR' ;
ZEITEREIGNIS : 'zeit' | 'ZEIT' ;

// ANTLR elige la coincidencia más larga: && es un token, & es otro.
UND : '&&' ; ODER : '||' ;
GLEICH : '==' ; UNGLEICH : '!=' ; GROESSER_GLEICH : '>=' ; KLEINER_GLEICH : '<=' ;
ZUWEISUNG : '=' ; GROESSER : '>' ; KLEINER : '<' ; NICHT : '!' ;
ADDITION : '+' ; SUBTRAKTION : '-' ; MULTIPLIKATION : '*' ; DIVISION : '/' ;
BLOCKGRENZE : '&' ; GRUPPENGRENZE : '~' ; LISTENGRENZE : '^' ;
ANWEISUNGSENDE : ';' ; DOPPELPUNKT : ':' ; PUNKT : '.' ; KOMMA : ',' ;

// Horarios 00:00..23:59. Un horario mal formado no pasa el parser.
UHRZEITWERT : ('0' DIGIT | '1' DIGIT | '2' [0-3]) ':' [0-5] DIGIT ;
ZAHL : DIGIT+ ('.' DIGIT+)? ;
// Unicode dentro del texto; escapes permitidos: \#, \\, \n, \r, \t.
// El literal completo gana por longitud; # aislado conserva TEXTGRENZE.
TEXTWERT : TEXTGRENZE ( '\\' [#\\nrt] | ~[#\\\r\n] )* TEXTGRENZE ;
TEXTGRENZE : '#' ;
KENNUNG : [a-zA-Z] [a-zA-Z0-9_]* ;
fragment DIGIT : [0-9] ;
// Los comentarios no anidan. Una apertura sin cierre produce rechazo.
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;
