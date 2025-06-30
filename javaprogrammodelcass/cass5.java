import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        String name=vadivel.nextLine();
        String department=vadivel.nextLine();
        double score=vadivel.nextDouble();
        double a=score/10;
        System.out.println("my name is"+name);
        System.out.println("my department is"+department);
        System.out.print("my score is"+a);
        
    }
}