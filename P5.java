public class P5 {
    public static void pattern(int n)
    {
        int k=69;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=0;j<i;j++)
            {
                int t=j+k;
                char c=(char)t;
                System.out.print(c);
            }
                k--;
                System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n=5;
        pattern(n);
    }
    
}
