
import java.util.Scanner;
public class bubble{
    public static void main(String []arg)
{                                     //FS21IF035 YASH AGHANE
    int  temp;  
    int[]a=new int[10];     // DECLARE ARRAY
    System.out.println("enter the size of array");      //TAKE SIZE OF ARRAY 
    int n=SC.nextInt();
    System.out.println("ENTEER THE ARRAY ELEMENTS");
    for(int i=0;i<n;i++)
    {
            a[i]=SC.nextInt();           //INPUT OF ARRAY ELEMRNTS
            
    }
    for(int i=0;i<n-1;i++)
    {
       for(int j=0;j<n-i-1;j++)
       {
        if(a[j]>a[j+1])
        {
            temp=a[j];                // OPERATION OF BUBBLE SORT
            a[j]=a[j+1];
            a[j+1]=temp;
        }
       }
    }

    System.out.println("SORTED ARRAY IS :-");
    for(int i=0;i<n;i++)
    {                                           //PRINT SORTED ARRAY
        System.err.println(a[i]);
    }
   
}
}
