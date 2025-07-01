import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
         Scanner vadivel=new Scanner(System.in);
     int a=vadivel.nextInt(); 
    int b=vadivel.nextInt();
    String result =a>b?"a is greater then b":"b is greater then a";
    System.out.print(result);
    }
}

