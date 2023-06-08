
import org.antlr.v4.runtime.tree.*;


public class draw_main{

    public static void main(String[] args)
    {


        draw_visitor visitor = new draw_visitor();
        draw_front start = new draw_front("./test.txt");
        try{
            start.doParse();
            ParseTree tree=start.getTree();
            draw_ui.Init_Draw();
            visitor.visit(tree);
            draw_ui.Destroy_Draw();
        }catch (Exception e)
        { e.printStackTrace();}




    } 
}