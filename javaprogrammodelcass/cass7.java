import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        String RCB=vadivel.nextLine();
        
        if(RCB.equals("win"))
        {
           System.out.print("ee sala cup namdhey");
        }
        else{
            System.out.print("no cup");
        }
    }
}