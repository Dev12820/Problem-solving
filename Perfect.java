import java.util.*;
import java.math.*;
public class Perfect {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(perfectno(n));
        }
        public static int perfectno(int n)
        {
            int factor=n;;
            int sum=0;
            for(int i=1;i<=n/2;i++)
            {
                if(n%i==0)
                sum+=i;
            }
            if(sum==factor)
            return sum;
            else
            return -1;
        }
    
}
