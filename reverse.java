import java.util.Scanner;

public class reverse {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a num to reverse++            ");
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0)
        {
            int reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;

        }
        System.out.println("the reverse num is"+reverse);
    }
}
