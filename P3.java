import java.util.*;
public class P3 {
    public static void pattern(int n)
    {
        int k=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char c=(char)k;
                System.out.print(c);
            }
            System.out.println();
            k++;
        }
    }
        public static void main(String args[])
        {
            int n=3;
            pattern( n);
        }
    
}
