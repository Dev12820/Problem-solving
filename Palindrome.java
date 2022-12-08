import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(palindrome(n));
    }
    public static int palindrome(int n)
    {
        int e=n;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
        if(e==sum)
        return sum;
        else 
        return -1;
    }
    
}
