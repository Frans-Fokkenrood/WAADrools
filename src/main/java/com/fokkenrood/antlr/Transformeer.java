package com.fokkenrood.antlr;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Transformeer {

	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from a (Risc Profile) textfile
		ANTLRInputStream input = new ANTLRFileStream("data\\" + ((args.length > 0) ? args[0] : "RegelSpraak.txt"));
	
		// create a lexer that feeds off of input CharStream
		RegelSpraakLexer lexer = new RegelSpraakLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		RegelSpraakParser parser = new RegelSpraakParser(tokens);
		
		// begin parsing at 'statements' rule
		ParseTree tree = parser.statements();
//		System.out.println("Parse tree:");
//		System.out.println(tree.toStringTree(parser));
//		System.out.println("...\n...");

		// Create generic parse tree walker, walk the tree and trigger callbacks
		WAADroolsListener listener = new WAADroolsListener();
		new ParseTreeWalker().walk(listener, tree);
	}	// end main
	
}	// end class