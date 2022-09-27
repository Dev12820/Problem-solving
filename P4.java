public class P4 {
    public static void pattern(int n)
    {
        int k=64;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;++j)
            {
                int t=k+j;
                char c=(char)t;
            System.out.print(c);
         
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
    
    

