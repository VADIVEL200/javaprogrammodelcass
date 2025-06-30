import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int num=vadivel.nextInt();
        
        if(num%2==0)
        {
           System.out.print("even number");
        }
        else{
            System.out.print("odd number");
        }
    }
}