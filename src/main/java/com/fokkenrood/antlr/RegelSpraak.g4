grammar RegelSpraak;

statements
	:
	(	regel
	|	testcase
	)+
	;

regel
	:
	(	RREGEL rg=TEKST IN rs=TEKST LUIDT DUBBELE_PUNT
		PUNT
	)
	;
	
testcase
	:
	(	TTESTCASE tc=TEKST IN rs=TEKST OMVAT DE VOLGENDE TESTGEVALLEN DUBBELE_PUNT
		(	testgeval
		)+
		PUNT
	)
	;

testgeval
	:
	(	STREEPJE tg=TEKST MET ALS INVOER DUBBELE_PUNT
		(	invoer
		)+
		WAARDOOR DE REGEL ( not=NIET )? ZAL VUREN
	)
	;

invoer
	:
	(	EEN
		(	obj=WERKGEVER
		|	obj=WERKNEMER
		|	obj=ARBEIDSOVEREENKOMST
		)
		(	toekennen[$obj.text]
		)+
	)
	;
	
toekennen[String obj]
	:
	(	WAARBIJ f=feit WORDT GESTELD OP w=waarde
	)
	;

waarde returns [String value]
	:
	(	WOORD										{ $value = $WOORD.text; }
	|	TEKST										{ $value = "\"" + $TEKST.text + "\""; }
	|	DATUM										{ $value = "@@" + $DATUM.text; }
	|	GETAL										{ $value = $GETAL.text; }
	|	GETAL_NUL									{ $value = "0"; }
	|	FLOAT										{ $value = $FLOAT.text.replace(',','.'); }
	|	NEE											{ $value = "false"; }
	|	JA											{ $value = "true"; }
	)
	;

vergelijking returns [String operator]
	:	
	(	IS GELIJK AAN								{ $operator = "=="; }
	|	IS NIET GELIJK AAN							{ $operator = "!="; }
	|	IS GROTER OF GELIJK AAN						{ $operator = ">="; }
	|	IS GROTER DAN								{ $operator = ">";  }
	|	IS KLEINER OF GELIJK AAN					{ $operator = "<="; }
	|	IS KLEINER DAN								{ $operator = "<";  }
	)
	;

feit returns [String signifier]
	:
	(	WOORD										{ $signifier  = $WOORD.text; }
		(	WOORD									{ $signifier += (" " + $WOORD.text); }
		|	IN										{ $signifier += (" in"); }
		|	OP										{ $signifier += (" op"); }
		)*
	) 
	;


BLOCKCOMMENT:			'/*' .*? '*/'					-> skip ;
LINECOMMENT:			'//' .*? '\r\n'					-> skip ;

fragment QUOTE:			'"' ;
fragment KOMMA:			',' ;
fragment LETTER:		[a-zA-Z] ;
fragment CIJFER:		[0-9] ;

TEKST:					QUOTE .*? QUOTE					{ setText(getText().replaceAll("\"","")); } ;

AAN:					'aan' ;
ALS:					'als' ;
ARBEIDSOVEREENKOMST:	'arbeidsovereenkomst' ;
DAN:					'dan' ;
DDE:					'De' ;
DE:						'de' ;
EEEN:					'Een' ;
EEN:					'een' ;
EN:						'en' ;
GELIJK:					'gelijk' ;
GESTELD:				'gesteld' ;
GROTER:					'groter' ;
HHET:					'Het' ;
HET:					'het' ;
INVOER:					'invoer' ;
IN:						'in' ;
IS:						'is' ;
JA:						'ja' ;
KLEINER:				'kleiner' ;
LUIDT:					'luidt' ;
MET:					'met' ;
NEE:					'nee' ;
NIET:					'niet' ;
OF:						'of' ;
OP:						'op' ;
OMVAT:					'omvat' ;
RREGEL:					'Regel' ;
REGEL:					'regel' ;
TTESTCASE:				'Testcase' ;
TESTGEVALLEN:			'testgevallen' ;
VOLGENDE:				'volgende' ;
VUREN:					'vuren' ;
WAARBIJ:				'waarbij' ;
WERKGEVER:				'werkgever' ;
WERKNEMER:				'werknemer' ;
WAARDOOR:				'waardoor' ;
WORDT:					'wordt' ;
ZAL:					'zal' ;

DUBBELE_PUNT:			':' ;
GETAL_NUL:				'0' ;
PUNT:					'.' ;
STREEPJE:				'-' ;

DATUM:					CIJFER CIJFER STREEPJE CIJFER CIJFER STREEPJE CIJFER CIJFER CIJFER CIJFER ;
FLOAT:					CIJFER* KOMMA CIJFER+ ;
GETAL:					( STREEPJE )? CIJFER+ ;
WOORD:					LETTER ( LETTER | STREEPJE )* ;

WS:						[ \t\r\n]+						-> skip ;
