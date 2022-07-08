public class arrayd{
    public static void main(String arg[])
    {
        int[]a=new int[5];
        int[]b=new int[5];
        int[]c=new int[5];
                int n=5;
        for(int i=0;i<5;i++)
        {
            a[i]=i;
        
        }
        for(int i=0;i<5;i++)
        { 
            b[i]=n;
            ++n;
        
        }
 System.out.println("value of array A:-");

for(int i=0;i<5;i++)
{
    System.out.println(a[i]);
}


System.out.println("value of array b :-");

for(int i=0;i<5;i++)
{
    System.out.println(b[i]);
}
 for(int i=0;i<5;i++)
 {
    c[i]=a[i]+b[i];
 }
 System.out.println("addition of array is");
 for(int i=0;i<5;i++)
 {
     System.out.println(c[i]);
 }

    }

}
    