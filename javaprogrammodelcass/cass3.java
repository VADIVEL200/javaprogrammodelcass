import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String arge[])
    {
        Scanner vadivel=new Scanner(System.in);
        String name=vadivel.nextLine();
        String address=vadivel.nextLine();
        int age=vadivel.nextInt();
        System.out.print("my name is"  +name);
        System.out.print("my address is"  +address);
        System.out.print("my age is"   +age);
    }
}
