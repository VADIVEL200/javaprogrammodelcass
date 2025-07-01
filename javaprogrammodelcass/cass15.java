import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
         System.out.println("enter your salary");
        int salary=vadivel.nextInt();
         System.out.println("enter your age");
        int age=vadivel.nextInt();
        if(salary>20000||age<25)
        {
            System.out.println("eligiable for loan");
             System.out.print("enter your loan amount");
            int loan=vadivel.nextInt();
            if(loan<50000)
            {
              System.out.print(" loan available");  
            }
            else
            {
                System.out.print(" loan not available");
            }
        }
        else
        {
            System.out.print("no loan");
        }
    }
}

