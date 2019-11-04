// Generated from PubSub.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var PubSubListener = require('./PubSubListener').PubSubListener;
var grammarFileName = "PubSub.g4";

var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u0010M\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0003\u0002\u0003\u0002\u0007\u0002\u0013\n\u0002\f\u0002\u000e",
    "\u0002\u0016\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003",
    "\u001b\n\u0003\f\u0003\u000e\u0003\u001e\u000b\u0003\u0003\u0003\u0003",
    "\u0003\u0007\u0003\"\n\u0003\f\u0003\u000e\u0003%\u000b\u0003\u0005",
    "\u0003\'\n\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0007\u0004/\n\u0004\f\u0004\u000e\u00042\u000b\u0004",
    "\u0003\u0004\u0003\u0004\u0007\u00046\n\u0004\f\u0004\u000e\u00049\u000b",
    "\u0004\u0005\u0004;\n\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003",
    "\u0006\u0005\u0006G\n\u0006\u0003\u0007\u0003\u0007\u0003\b\u0003\b",
    "\u0003\b\u0002\u0002\t\u0002\u0004\u0006\b\n\f\u000e\u0002\u0004\u0003",
    "\u0002\u000b\f\u0003\u0002\u0003\u0004\u0002N\u0002\u0014\u0003\u0002",
    "\u0002\u0002\u0004\u0017\u0003\u0002\u0002\u0002\u0006+\u0003\u0002",
    "\u0002\u0002\b?\u0003\u0002\u0002\u0002\nF\u0003\u0002\u0002\u0002\f",
    "H\u0003\u0002\u0002\u0002\u000eJ\u0003\u0002\u0002\u0002\u0010\u0013",
    "\u0005\u0004\u0003\u0002\u0011\u0013\u0005\u0006\u0004\u0002\u0012\u0010",
    "\u0003\u0002\u0002\u0002\u0012\u0011\u0003\u0002\u0002\u0002\u0013\u0016",
    "\u0003\u0002\u0002\u0002\u0014\u0012\u0003\u0002\u0002\u0002\u0014\u0015",
    "\u0003\u0002\u0002\u0002\u0015\u0003\u0003\u0002\u0002\u0002\u0016\u0014",
    "\u0003\u0002\u0002\u0002\u0017\u0018\u0007\r\u0002\u0002\u0018&\u0007",
    "\t\u0002\u0002\u0019\u001b\u0005\b\u0005\u0002\u001a\u0019\u0003\u0002",
    "\u0002\u0002\u001b\u001e\u0003\u0002\u0002\u0002\u001c\u001a\u0003\u0002",
    "\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d#\u0003\u0002",
    "\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001f \u0007\b\u0002",
    "\u0002 \"\u0005\b\u0005\u0002!\u001f\u0003\u0002\u0002\u0002\"%\u0003",
    "\u0002\u0002\u0002#!\u0003\u0002\u0002\u0002#$\u0003\u0002\u0002\u0002",
    "$\'\u0003\u0002\u0002\u0002%#\u0003\u0002\u0002\u0002&\u001c\u0003\u0002",
    "\u0002\u0002&\'\u0003\u0002\u0002\u0002\'(\u0003\u0002\u0002\u0002(",
    ")\u0007\n\u0002\u0002)*\u0007\u0005\u0002\u0002*\u0005\u0003\u0002\u0002",
    "\u0002+,\u0007\u000e\u0002\u0002,:\u0007\t\u0002\u0002-/\u0005\b\u0005",
    "\u0002.-\u0003\u0002\u0002\u0002/2\u0003\u0002\u0002\u00020.\u0003\u0002",
    "\u0002\u000201\u0003\u0002\u0002\u000217\u0003\u0002\u0002\u000220\u0003",
    "\u0002\u0002\u000234\u0007\b\u0002\u000246\u0005\b\u0005\u000253\u0003",
    "\u0002\u0002\u000269\u0003\u0002\u0002\u000275\u0003\u0002\u0002\u0002",
    "78\u0003\u0002\u0002\u00028;\u0003\u0002\u0002\u000297\u0003\u0002\u0002",
    "\u0002:0\u0003\u0002\u0002\u0002:;\u0003\u0002\u0002\u0002;<\u0003\u0002",
    "\u0002\u0002<=\u0007\n\u0002\u0002=>\u0007\u0005\u0002\u0002>\u0007",
    "\u0003\u0002\u0002\u0002?@\u0007\u000f\u0002\u0002@A\u0007\u0006\u0002",
    "\u0002AB\u0005\n\u0006\u0002BC\u0007\u0005\u0002\u0002C\t\u0003\u0002",
    "\u0002\u0002DG\u0005\f\u0007\u0002EG\u0005\u000e\b\u0002FD\u0003\u0002",
    "\u0002\u0002FE\u0003\u0002\u0002\u0002G\u000b\u0003\u0002\u0002\u0002",
    "HI\t\u0002\u0002\u0002I\r\u0003\u0002\u0002\u0002JK\t\u0003\u0002\u0002",
    "K\u000f\u0003\u0002\u0002\u0002\u000b\u0012\u0014\u001c#&07:F"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'true'", "'false'", "';'", "':'", "'.'", "','", 
                     "'{'", "'}'", null, null, "'natP'", "'natS'" ];

var symbolicNames = [ null, null, null, "SEMICOLON", "COLON", "DOT", "COMMA", 
                      "LEFT_BRACE", "RIGHT_BRACE", "SINGLE_STRING", "DOUBLE_STRING", 
                      "NATP", "NATS", "IDENTIFIER", "WS" ];

var ruleNames =  [ "compilationUnit", "natP", "natS", "keyValuePair", "primitive", 
                   "string", "bool" ];

function PubSubParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

PubSubParser.prototype = Object.create(antlr4.Parser.prototype);
PubSubParser.prototype.constructor = PubSubParser;

Object.defineProperty(PubSubParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

PubSubParser.EOF = antlr4.Token.EOF;
PubSubParser.T__0 = 1;
PubSubParser.T__1 = 2;
PubSubParser.SEMICOLON = 3;
PubSubParser.COLON = 4;
PubSubParser.DOT = 5;
PubSubParser.COMMA = 6;
PubSubParser.LEFT_BRACE = 7;
PubSubParser.RIGHT_BRACE = 8;
PubSubParser.SINGLE_STRING = 9;
PubSubParser.DOUBLE_STRING = 10;
PubSubParser.NATP = 11;
PubSubParser.NATS = 12;
PubSubParser.IDENTIFIER = 13;
PubSubParser.WS = 14;

PubSubParser.RULE_compilationUnit = 0;
PubSubParser.RULE_natP = 1;
PubSubParser.RULE_natS = 2;
PubSubParser.RULE_keyValuePair = 3;
PubSubParser.RULE_primitive = 4;
PubSubParser.RULE_string = 5;
PubSubParser.RULE_bool = 6;

function CompilationUnitContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_compilationUnit;
    return this;
}

CompilationUnitContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CompilationUnitContext.prototype.constructor = CompilationUnitContext;

CompilationUnitContext.prototype.natP = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(NatPContext);
    } else {
        return this.getTypedRuleContext(NatPContext,i);
    }
};

CompilationUnitContext.prototype.natS = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(NatSContext);
    } else {
        return this.getTypedRuleContext(NatSContext,i);
    }
};

CompilationUnitContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterCompilationUnit(this);
	}
};

CompilationUnitContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitCompilationUnit(this);
	}
};




PubSubParser.CompilationUnitContext = CompilationUnitContext;

PubSubParser.prototype.compilationUnit = function() {

    var localctx = new CompilationUnitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, PubSubParser.RULE_compilationUnit);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 18;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===PubSubParser.NATP || _la===PubSubParser.NATS) {
            this.state = 16;
            this._errHandler.sync(this);
            switch(this._input.LA(1)) {
            case PubSubParser.NATP:
                this.state = 14;
                this.natP();
                break;
            case PubSubParser.NATS:
                this.state = 15;
                this.natS();
                break;
            default:
                throw new antlr4.error.NoViableAltException(this);
            }
            this.state = 20;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function NatPContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_natP;
    return this;
}

NatPContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
NatPContext.prototype.constructor = NatPContext;

NatPContext.prototype.NATP = function() {
    return this.getToken(PubSubParser.NATP, 0);
};

NatPContext.prototype.LEFT_BRACE = function() {
    return this.getToken(PubSubParser.LEFT_BRACE, 0);
};

NatPContext.prototype.RIGHT_BRACE = function() {
    return this.getToken(PubSubParser.RIGHT_BRACE, 0);
};

NatPContext.prototype.SEMICOLON = function() {
    return this.getToken(PubSubParser.SEMICOLON, 0);
};

NatPContext.prototype.keyValuePair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(KeyValuePairContext);
    } else {
        return this.getTypedRuleContext(KeyValuePairContext,i);
    }
};

NatPContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterNatP(this);
	}
};

NatPContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitNatP(this);
	}
};




PubSubParser.NatPContext = NatPContext;

PubSubParser.prototype.natP = function() {

    var localctx = new NatPContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, PubSubParser.RULE_natP);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 21;
        this.match(PubSubParser.NATP);
        this.state = 22;
        this.match(PubSubParser.LEFT_BRACE);
        this.state = 36;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
        if(la_===1) {
            this.state = 26;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===PubSubParser.IDENTIFIER) {
                this.state = 23;
                this.keyValuePair();
                this.state = 28;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 33;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===PubSubParser.COMMA) {
                this.state = 29;
                this.match(PubSubParser.COMMA);
                this.state = 30;
                this.keyValuePair();
                this.state = 35;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }

        }
        this.state = 38;
        this.match(PubSubParser.RIGHT_BRACE);
        this.state = 39;
        this.match(PubSubParser.SEMICOLON);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function NatSContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_natS;
    return this;
}

NatSContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
NatSContext.prototype.constructor = NatSContext;

NatSContext.prototype.NATS = function() {
    return this.getToken(PubSubParser.NATS, 0);
};

NatSContext.prototype.LEFT_BRACE = function() {
    return this.getToken(PubSubParser.LEFT_BRACE, 0);
};

NatSContext.prototype.RIGHT_BRACE = function() {
    return this.getToken(PubSubParser.RIGHT_BRACE, 0);
};

NatSContext.prototype.SEMICOLON = function() {
    return this.getToken(PubSubParser.SEMICOLON, 0);
};

NatSContext.prototype.keyValuePair = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(KeyValuePairContext);
    } else {
        return this.getTypedRuleContext(KeyValuePairContext,i);
    }
};

NatSContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterNatS(this);
	}
};

NatSContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitNatS(this);
	}
};




PubSubParser.NatSContext = NatSContext;

PubSubParser.prototype.natS = function() {

    var localctx = new NatSContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, PubSubParser.RULE_natS);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 41;
        this.match(PubSubParser.NATS);
        this.state = 42;
        this.match(PubSubParser.LEFT_BRACE);
        this.state = 56;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        if(la_===1) {
            this.state = 46;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===PubSubParser.IDENTIFIER) {
                this.state = 43;
                this.keyValuePair();
                this.state = 48;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 53;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===PubSubParser.COMMA) {
                this.state = 49;
                this.match(PubSubParser.COMMA);
                this.state = 50;
                this.keyValuePair();
                this.state = 55;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }

        }
        this.state = 58;
        this.match(PubSubParser.RIGHT_BRACE);
        this.state = 59;
        this.match(PubSubParser.SEMICOLON);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function KeyValuePairContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_keyValuePair;
    return this;
}

KeyValuePairContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
KeyValuePairContext.prototype.constructor = KeyValuePairContext;

KeyValuePairContext.prototype.IDENTIFIER = function() {
    return this.getToken(PubSubParser.IDENTIFIER, 0);
};

KeyValuePairContext.prototype.COLON = function() {
    return this.getToken(PubSubParser.COLON, 0);
};

KeyValuePairContext.prototype.primitive = function() {
    return this.getTypedRuleContext(PrimitiveContext,0);
};

KeyValuePairContext.prototype.SEMICOLON = function() {
    return this.getToken(PubSubParser.SEMICOLON, 0);
};

KeyValuePairContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterKeyValuePair(this);
	}
};

KeyValuePairContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitKeyValuePair(this);
	}
};




PubSubParser.KeyValuePairContext = KeyValuePairContext;

PubSubParser.prototype.keyValuePair = function() {

    var localctx = new KeyValuePairContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, PubSubParser.RULE_keyValuePair);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 61;
        this.match(PubSubParser.IDENTIFIER);
        this.state = 62;
        this.match(PubSubParser.COLON);
        this.state = 63;
        this.primitive();
        this.state = 64;
        this.match(PubSubParser.SEMICOLON);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PrimitiveContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_primitive;
    return this;
}

PrimitiveContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PrimitiveContext.prototype.constructor = PrimitiveContext;

PrimitiveContext.prototype.string = function() {
    return this.getTypedRuleContext(StringContext,0);
};

PrimitiveContext.prototype.bool = function() {
    return this.getTypedRuleContext(BoolContext,0);
};

PrimitiveContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterPrimitive(this);
	}
};

PrimitiveContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitPrimitive(this);
	}
};




PubSubParser.PrimitiveContext = PrimitiveContext;

PubSubParser.prototype.primitive = function() {

    var localctx = new PrimitiveContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, PubSubParser.RULE_primitive);
    try {
        this.state = 68;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case PubSubParser.SINGLE_STRING:
        case PubSubParser.DOUBLE_STRING:
            this.enterOuterAlt(localctx, 1);
            this.state = 66;
            this.string();
            break;
        case PubSubParser.T__0:
        case PubSubParser.T__1:
            this.enterOuterAlt(localctx, 2);
            this.state = 67;
            this.bool();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StringContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_string;
    return this;
}

StringContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StringContext.prototype.constructor = StringContext;

StringContext.prototype.SINGLE_STRING = function() {
    return this.getToken(PubSubParser.SINGLE_STRING, 0);
};

StringContext.prototype.DOUBLE_STRING = function() {
    return this.getToken(PubSubParser.DOUBLE_STRING, 0);
};

StringContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterString(this);
	}
};

StringContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitString(this);
	}
};




PubSubParser.StringContext = StringContext;

PubSubParser.prototype.string = function() {

    var localctx = new StringContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, PubSubParser.RULE_string);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 70;
        _la = this._input.LA(1);
        if(!(_la===PubSubParser.SINGLE_STRING || _la===PubSubParser.DOUBLE_STRING)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BoolContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = PubSubParser.RULE_bool;
    return this;
}

BoolContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BoolContext.prototype.constructor = BoolContext;


BoolContext.prototype.enterRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.enterBool(this);
	}
};

BoolContext.prototype.exitRule = function(listener) {
    if(listener instanceof PubSubListener ) {
        listener.exitBool(this);
	}
};




PubSubParser.BoolContext = BoolContext;

PubSubParser.prototype.bool = function() {

    var localctx = new BoolContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, PubSubParser.RULE_bool);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 72;
        _la = this._input.LA(1);
        if(!(_la===PubSubParser.T__0 || _la===PubSubParser.T__1)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.PubSubParser = PubSubParser;
