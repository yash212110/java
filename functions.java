
import java.util.Scanner;
public class functions {

    public static void printMyname(String name)
    {
         System.out.println(name);
         return;
    }



public static void main(String arg [])
       {
           Scanner sc=new Scanner(System.in);
           String name=sc.next();
            printMyname(name); //call function
    }


}
