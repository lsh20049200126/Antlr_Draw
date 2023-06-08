import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class draw_front {
    protected ParseTree tree =null;
    protected String  theFilePath;

    public draw_front(String filePath)
    { theFilePath = filePath; }

    public ParseTree getTree()
    { return tree; }

    public int  doParse() throws Exception
    {   java.io.InputStream is = System.in;
        if ( theFilePath != null ) {
            is = new FileInputStream(theFilePath);
        }
        ANTLRInputStream input =new ANTLRInputStream( is );
        DRAWLexer lexer =new DRAWLexer(input);
        CommonTokenStream tokens =new CommonTokenStream(lexer);
        DRAWParser parser =new DRAWParser(tokens);
        tree   = parser . program ();
        return  parser.getNumberOfSyntaxErrors();

    }

}
