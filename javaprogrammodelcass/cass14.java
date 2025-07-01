import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        String color=vadivel.nextLine();
        
        if(color.equals("red"))
        {
           System.out.print("stop");
        }
        else if(color.equals("yellow"))
        {
            System.out.print("get ready");
        }
        else if (color.equals("green"))
        {
            System.out.print("go");
        }
        else
        {
          System.out.print("unknowncolor");  
        }
    }
}
