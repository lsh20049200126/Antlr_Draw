import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class draw_visitor extends DRAWBaseVisitor<Double>
{
    public draw_visitor()
    {

    }
    private double TT =0; // for 语句中，循环变量 T 的当前值
    private double originX =0; // 坐标平移参数
    private double originY =0;
    private double scaleX =1;  // 横向缩放因子
    private double scaleY =1;  // 纵向缩放因子
    private double rotate =0;  // 旋转角度







    public Double visitFOR(DRAWParser.FORContext ctx) {
       double start,end,step;
       start=visit(ctx.expr(0));
       end=visit(ctx.expr(1));
       step=visit(ctx.expr(2));
       double px,py;
       if((end-start)*step<=0)
       {
           int line=ctx.getStart().getLine();
           System.out.print("error: There is infinite loop in line: "+line+"\n");
           return 0.0;
       }
       int isout=0;
       for (double i=start;i<end;i+=step)
       {
           TT=i;
           px=visit(ctx.expr(3));
           py=visit(ctx.expr(4));

           double x = (px * scaleX);
           double y = (py * scaleY);
           double xx = Math.cos(rotate) * x + Math.sin(rotate) * y;
           double yy = Math.cos(rotate) * y - Math.sin(rotate) * x;
           x = xx+originX;
           y = yy+originY;
           draw_ui.Draw_Point(x,y);
           if((x>700|y>700|x<0|y<0)&&isout==0)
           {   isout=1;
               int line=ctx.getStart().getLine();
               System.out.print("error: The plotting statement has out-of-bounds behavior in line: "+line+"\n");
           }
       }
     

        return 0.0;
    }

    @Override
    public Double visitORIGIN(DRAWParser.ORIGINContext ctx) {
        originX=visit(ctx.expr(0));
        originY=visit(ctx.expr(1));
        return 0.0;
    }

    @Override
    public Double visitSCALE(DRAWParser.SCALEContext ctx) {
        scaleX=visit(ctx.expr(0));
        scaleY=visit(ctx.expr(1));
        return 0.0;
    }

    @Override
    public Double visitROT(DRAWParser.ROTContext ctx) {
        rotate=visit(ctx.expr());
        return 0.0;
    }

    @Override
    public Double visitCOLOR(DRAWParser.COLORContext ctx) {
        double color_r,color_g,color_b;
        color_r=visit(ctx.expr(0));
        color_g=visit(ctx.expr(1));
        color_b=visit(ctx.expr(2));
        draw_ui.Set_Color(color_r,color_g,color_b);
        return 0.0;
    }

    @Override
    public Double visitSIZE(DRAWParser.SIZEContext ctx) {
        double size;
        size=visit(ctx.expr());
        draw_ui.Set_Size(size);
        return 0.0;
    }

    @Override
    public Double visitDIV(DRAWParser.DIVContext ctx) {
        double x,y;
        x=visit(ctx.expr(0));
        y=visit(ctx.expr(1));
        double ans=0;
        int line=ctx.expr(1).getStart().getLine();
        int column=ctx.expr(1).getStart().getCharPositionInLine();
        if(y==0){
            System.out.print("error: The divisor in ("+line+","+column+") cannot be zero.\n");
        }
        else ans=x/y;
        return ans;
    }

    @Override
    public Double visitT(DRAWParser.TContext ctx) {
        return TT;
    }

    @Override
    public Double visitFUNC(DRAWParser.FUNCContext ctx) {
        Token id = ctx.FUNC().getSymbol();
        String funcName = id.getText().toLowerCase();
        double value = 0;
        double param = visit(ctx.expr());  // 函数调用的参数值
        if(funcName.equals("sin")) value = Math.sin(param);
        else if(funcName.equals("cos")) value = Math.cos(param);
        else if(funcName.equals("tan")) value = Math.tan(param);
        else if(funcName.equals("ln"))  value = Math.log(param);
        else if(funcName.equals("exp")) value = Math.exp(param);
        else if(funcName.equals("sqrt")) value= Math.sqrt(param);
        else {

        }

        return value;
    }

    @Override
    public Double visitMUL(DRAWParser.MULContext ctx) {
        double x,y;
        x=visit(ctx.expr(0));
        y=visit(ctx.expr(1));
        double value=0;
        value=x*y;
        return value;
    }

    @Override
    public Double visitCONST(DRAWParser.CONSTContext ctx) {
        Token tk = ctx.CONST().getSymbol();
        String vName = tk.getText().toLowerCase();
        double value = 0.0;

        if(vName.equals("pi")){
            value = Math.PI; //3.1415926
        }else if(vName.equals("e")){
            value=Math.E;
        }else {
            try {
                value = Double.parseDouble(vName);
            } catch(Exception e) {
                value = 0;
            }
        }
        return value;
    }

    @Override
    public Double visitPOWER(DRAWParser.POWERContext ctx) {
        double x,y;
        x=visit(ctx.expr(0));
        y=visit(ctx.expr(1));
        double value=0;
        value=Math.pow(x,y);
        return value;
    }

    @Override
    public Double visitProgram(DRAWParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Double visitERROR(DRAWParser.ERRORContext ctx) {

        return 0.0;
    }

    @Override
    public Double visitPLUS1(DRAWParser.PLUS1Context ctx) {
        double value=0;
        value=visit(ctx.expr());
        return value;
    }

    @Override
    public Double visitMINUS1(DRAWParser.MINUS1Context ctx) {
        double value=0;
        value=-1*visit(ctx.expr());
        return value;
    }

    @Override
    public Double visitLRBACK(DRAWParser.LRBACKContext ctx) {
        double value=0;
        value = visit(ctx.expr());
        return value;
    }

    @Override
    public Double visitPLUS(DRAWParser.PLUSContext ctx) {
        double x,y;
        x=visit(ctx.expr(0));
        y=visit(ctx.expr(1));
        double value=0;
        value=x+y;
        return value;
    }

    @Override
    public Double visitMINUS(DRAWParser.MINUSContext ctx) {
        double x,y;
        x=visit(ctx.expr(0));
        y=visit(ctx.expr(1));
        double value=0;
        value=x-y;
        return value;
    }
}