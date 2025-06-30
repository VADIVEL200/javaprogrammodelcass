import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        String meghana=vadivel.nextLine();
        
        if(meghana.equals("dead"))
        {
           System.out.print("Surya meets ramya");
        }
        else{
            System.out.print("surya weds meghana");
        }
    }
}