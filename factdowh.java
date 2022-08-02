import java.util.*;
public class factdowh {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number t find factorial");
        int num=sc.nextInt();
        int fact=1;
        int i=1;
        do
        {
            fact=fact*i;
            i++;
        }
        while( i<=num);
System.out.println("factorial of num is "+fact);

    }
}