import java.util.*;
public class P1
{
    public static void pattern(int n)
    {
        int k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;++j)
            {
            System.out.print(k+j);
         
            }
            k++;
            System.out.println();
            

        }
    }
 public static void main(String args[]) throws java.lang.Exception
 
{
    int n=4;
    pattern(n);
}
}
    