import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        int income=vadivel.nextInt();
        
        if(income>7000)
        {
           System.out.print("scholarship is available");
        }
        else{
            System.out.print("not eligible for scholarship");
        }
    }
}
