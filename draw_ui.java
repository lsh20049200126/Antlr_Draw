import java.io.*;

public class draw_ui {

   static String filePath;
    static  public void Set_Color(double x,double y,double z)
    {
        double ans=x+y+z;
        if(ans==0)
        {

        }
        else
        {
            x=x/ans;
            y=y/ans;
            z=z/ans;
        }
        String content1 = "clr=[(%f,%f,%f)]\n";
        String content =String.format(content1,x,y,z);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // 使用 true 参数以追加模式打开文件
            writer.write(content);
            writer.newLine(); // 可选：换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static  public void Set_Size(double x)
    {
        String content1 = "big=%f\n";
        String content =String.format(content1,x);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // 使用 true 参数以追加模式打开文件
            writer.write(content);
            writer.newLine(); // 可选：换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static public void Init_Draw()
    {
        filePath = "end_draw.py"; // 文件路径为当前目录下的 end_draw.py 文件
        String content1 = "import matplotlib.pyplot as plt\nfig, ax = plt.subplots(figsize=(10,10))\nax.set_xlim(0, 700)\nax.set_ylim(0, 700)\nclr='black'\nbig=1.0\nplt.title('The Draw of 20049200126LuoSiHua')\n";
        String content =String.format(content1);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath)); // 使用 true 参数以追加模式打开文件
            writer.write(content);
            writer.newLine(); // 可选：换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    static public void Destroy_Draw()
    {
        String content1 = "ax.set_xticks([])\nax.set_yticks([])\nplt.show()\n";
        String content =String.format(content1);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // 使用 true 参数以追加模式打开文件
            writer.write(content);
            writer.newLine(); // 可选：换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static public void Draw_Point(double x,double y)
    {
        String content1 = "ax.scatter(%f, %f, s=big, c=clr)\n";
        String content =String.format(content1,x,y);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true)); // 使用 true 参数以追加模式打开文件
            writer.write(content);
            writer.newLine(); // 可选：换行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
