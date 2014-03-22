package com.cst426.chatbot;

/**
 * ChatBotMain.java
 *
 * This is the main program for the chatbot
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.cst426.chatbot.grammar.*;

import com.cst426.chatbot.Vocabulary;

public class ChatBotMain
{
    public static void main(String[] args) throws Exception
    {
        String inputFile = null;

        // Validate whether input file was passed as command line argument,
        // if not then exit program with error message.

        if (args.length > 0)
        {
            inputFile = args[0];
        }
        else
        {
            System.out.println("ERROR: no input file specified.");
            System.exit(1);
        }

        // Create a FileInputStream instance, otherwise throw an error if the
        // filename cannot be found and exit program

        InputStream is = System.in;

        try
        {
            is = new FileInputStream(inputFile);
        }
        catch (Exception e)
        {
            System.out.println("ERROR: " + args[0] + " not found.");
            System.exit(1);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);

        ChatBotLexer lexer = new ChatBotLexer(input);

        CommonTokenStream originalTokens = new CommonTokenStream(lexer);

        // We then want to lookup each token in the dictionary and see which part of
        // speech they correspond to, e.g. noun, verb, etc. We then use our generic
        // token NOUN, VERB, etc., in place of the actual tokens and then supply
        // those to the ChatBotParser.

        List<String> buffer = new ArrayList<String> ();
        Vocabulary vocab = new Vocabulary();

        List<Token> list = originalTokens.getTokens();

        /*
        for (int i = 0; i < length; ++i)
        {
            // look up up the current token in the vocabulary
            Word word = null;

            String key = originalTokens.get(i).toString();

            word = vocab.lookupWord(key);

            if (word != null)
            {
                buffer.add( word.getType() );
            }
        }
        */

        for (String s : buffer)
        {
            System.out.println(s);
        }

        /*
        ChatBotParser parser = new ChatBotParser(tokens);

        ParseTree tree = parser.prog();

        ChatBotSentenceVisitor visitor = new ChatBotSentenceVisitor();

        visitor.visit(tree);
        */
    }
}
