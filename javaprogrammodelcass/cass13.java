import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int sub1=vadivel.nextInt();
        int sub2=vadivel.nextInt();
        int sub3=vadivel.nextInt();
        int sub4=vadivel.nextInt();
        int sub5=vadivel.nextInt();
        int a=sub1+sub2+sub3+sub4+sub5;
        int b=a/5;
        if(b<35)
        {
           System.out.print("additional classs is required");
        }
        else 
        {
            System.out.print("you are good to go");
        }
        
    }
}