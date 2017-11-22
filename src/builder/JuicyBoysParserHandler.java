package builder;

import antlrgenerated.JuicyBoysBaseListener;
import antlrgenerated.JuicyBoysLexer;
import antlrgenerated.JuicyBoysParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import semantics.JuicyBoysBaseImplementor;

/**
 * Created by krish on 20/11/2017.
 */
public class JuicyBoysParserHandler {

    private static JuicyBoysParserHandler instance = null;

    public static JuicyBoysParserHandler getInstance(){
        if (instance == null){
            instance = new JuicyBoysParserHandler();
        }

        return instance;
    }

    private JuicyBoysLexer juicyLexer;
    private JuicyBoysParser juicyParser;

    public JuicyBoysParserHandler() {
    }


    public void parseText(String textToParse){

        this.juicyLexer = new JuicyBoysLexer(new ANTLRInputStream(textToParse));
        CommonTokenStream tokens = new CommonTokenStream(this.juicyLexer);
        this.juicyParser = new JuicyBoysParser(tokens);
        JuicyBoysANTLRErrorListener errorListener = new JuicyBoysANTLRErrorListener();

        //remove the ConsoleErrorListeners
        this.juicyParser.removeErrorListeners();
        //add our custom errorListener
        this.juicyParser.addErrorListener(errorListener);

        ParserRuleContext parserRuleContext = this.juicyParser.compilationUnit();
        System.out.println(parserRuleContext.toStringTree(this.juicyParser));

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(new JuicyBoysBaseImplementor(), parserRuleContext);
    }
}
