import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int score=vadivel.nextInt();
        
        if(score<50)
        {
           System.out.print("you need to improve");
        }
        else if(score==50||score>50&&score<70)
        {
            System.out.print("good job");
        }
        else if(score>70)
        {
            System.out.print("excellent performance");
        }
    }
}