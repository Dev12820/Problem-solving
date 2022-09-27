import java.util.*;
public class S2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fact(n));
        
    }
    public static int fact(int n)
    {
        // int f=1,sum=0;
        int num=1;
        int sum2=0;
        while(num<=n)
        {
        int sum=1;
       
        for(int i=1;i<=num;i++)
        {
        sum*=i;
        }
        sum2+=sum/num;
        num++;
    }
        return sum2;
    }
}

    

