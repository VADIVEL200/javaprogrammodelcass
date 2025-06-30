import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int a=vadivel.nextInt();
        int b=vadivel.nextInt();
        int c=vadivel.nextInt();
        int d=a+b+c;
        int e=a*b*c;
        System.out.print(d/e);
        
    }
}
