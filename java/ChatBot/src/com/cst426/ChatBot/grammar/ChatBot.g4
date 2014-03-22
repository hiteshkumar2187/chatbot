grammar ChatBot;

/**
 * grammar rules
 */

prog
    : line+
    ;

line
    : sentence EOL
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
    : PRONOUN
    ;

properNoun
    : PROPERNOUN
    ;

preposition
    : PREPOSITION
    ;

det
    : DETERMINER
    ;

verb
    : VERB
    ;

noun
    : NOUN
    ;


/*
 * Lexical Rules
 */

EOL        : '\r' ? '\n' ;

NUMBER     : '[0-9]'+;

WS         : ' ' -> channel(HIDDEN);

// Lexemes representing parts of speech are just placeholders,
// used merely to recongize grammatically correct sentence.
// Semantic analysis will be done via dictionary lookup.

PRONOUN     : 'pronoun';

PROPERNOUN  : 'properNoun';

PREPOSITION : 'preposition';

DETERMINER  : 'determiner';

NOUN        : 'noun';

VERB        : 'verb';
