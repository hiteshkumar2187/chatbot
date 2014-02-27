package com.cst426.ChatBot;

/**
 * ChatBotMain.java
 *
 * This is the main program for the ChatBot
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import java.io.InputStream;
import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ChatBotMain
{
    public static void main(String[] args) throws Exception
    {
        String inputFile = null;

        //
        // Validate whether input file was passed as command line argument,
        // if not then exit program with error message.
        //

        if (args.length > 0)
        {
            inputFile = args[0];
        }
        else
        {
            System.out.println("ERROR: no input file specified.");
            System.exit(1);
        }

        // Create a FileInputStream instance, give it the file name
        InputStream is = new FileInputStream(inputFile);

        // Create an AntlrInputStream instance, give it the InputStream
        ANTLRInputStream input = new ANTLRInputStream(is);

        // Create a CalculatorLexer instance, give it the AntlrInputStream
        ChatBotLexer lexer = new ChatBotLexer(input);

        // Create a CommonTokenStream instance, give it the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a CalculatorParser instance, give it the token stream
        ChatBotParser parser = new ChatBotParser(tokens);

        // Parse the tree starting at "line"
        ParseTree tree = parser.prog();

        //
        // Create a new instance of the datastore and our ChatBotExprVisitor
        // and give it a reference to the DataStore
        //

        DataStore dataStore = new DataStore();
        ChatBotExprVisitor visitor = new ChatBotExprVisitor(dataStore);

        // visit the parse tree
        visitor.visit(tree);

        // print out the Vocabulary
        System.out.println( dataStore.getVocabulary().toString() );
    }
}
