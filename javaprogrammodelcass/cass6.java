
import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int num1=vadivel.nextInt();
        int num2=vadivel.nextInt();
        
        if(num1==num2)
        {
           System.out.print("both are equal");
        }
        else{
            System.out.print("not equal");
        }
    }
}
