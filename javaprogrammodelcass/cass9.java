import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int mark=vadivel.nextInt();
        
        if(mark>35)
        {
           System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
    }
}