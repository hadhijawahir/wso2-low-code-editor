// Generated from PubSub.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by PubSubParser.
function PubSubListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

PubSubListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
PubSubListener.prototype.constructor = PubSubListener;

// Enter a parse tree produced by PubSubParser#compilationUnit.
PubSubListener.prototype.enterCompilationUnit = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#compilationUnit.
PubSubListener.prototype.exitCompilationUnit = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#natP.
PubSubListener.prototype.enterNatP = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#natP.
PubSubListener.prototype.exitNatP = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#natS.
PubSubListener.prototype.enterNatS = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#natS.
PubSubListener.prototype.exitNatS = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#keyValuePair.
PubSubListener.prototype.enterKeyValuePair = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#keyValuePair.
PubSubListener.prototype.exitKeyValuePair = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#primitive.
PubSubListener.prototype.enterPrimitive = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#primitive.
PubSubListener.prototype.exitPrimitive = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#string.
PubSubListener.prototype.enterString = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#string.
PubSubListener.prototype.exitString = function(ctx) {
};


// Enter a parse tree produced by PubSubParser#bool.
PubSubListener.prototype.enterBool = function(ctx) {
};

// Exit a parse tree produced by PubSubParser#bool.
PubSubListener.prototype.exitBool = function(ctx) {
};



exports.PubSubListener = PubSubListener;