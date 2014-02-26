grammar ChatBot;

@parser::members
{
	protected const int EOF = Eof;
}

@lexer::members
{
	protected const int EOF = Eof;
	protected const int HIDDEN = Hidden;
}

@lexer::namespace{ChatBot}
@parser::namespace{ChatBot}

/*
 * Parser Rules
 */

line 
	: sentence EOF
	;

sentence
	: np vp
	;

np
	: pronoun
	| properNoun
	| det nominal
	;

nominal
	: noun nominal
	| noun
	;

vp
	: verb
	| verb np
	| verb np pp
	| verb pp
	;

pp
	: preposition np
	;

pronoun
	: I
	| YOU
	| HE
	| SHE
	| THEY
	| IT
	;

properNoun
	: JACOB
	| DUSTIN
	| DYLAN
	| BOT
	;

preposition
	: IN
	| ON
	| FOR
	| TO
	| BY
	| WITH
	| AT
	| OF
	| FROM
	| AS
	;

det
	: THE
	| ALL
	| A
	| SOME
	| WHICH
	| THIS
	| THAT
	| BOTH
	| MY
	| YOUR
	;

verb
	: EAT
	| LIKE
	;

noun
	: PIZZA
	| COMPUTER
	;

/*
 * Lexer Rules
 */

NUMBER : '[0-9]'+;

WS : ' ' -> channel(HIDDEN);

// pronouns

I : 'I';

YOU : 'You' | 'you';

HE : 'He' | 'he';

SHE : 'She' | 'she';

THEY : 'They' | 'they';

IT : 'It' | 'it';

// proper nouns

JACOB : 'Jacob';

DUSTIN : 'Dustin';

DYLAN : 'Dylan';

BOT : 'Bot';

// prepositions

IN : 'in';

ON : 'on';

FOR : 'for';

TO : 'to';

BY : 'by';

WITH : 'with';

AT : 'at';

OF : 'of';

FROM : 'from';

AS : 'as';

// determiners

THE : 'The' | 'the';

ALL : 'All' | 'all';

A : 'A' | 'a';

SOME : 'Some' | 'some';

WHICH : 'Which' | 'which';

THIS : 'This' | 'this';

THAT : 'That' | 'that';

BOTH : 'Both' | 'both';

MY : 'My' | 'my';

YOUR : 'Your' | 'your';

// nouns

PIZZA : 'pizza';

COMPUTER : 'computer';

// verbs

EAT : 'eat';

LIKE : 'likes' | 'like';

