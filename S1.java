import java.util.*;
class S1
{
        static int findFactSum(int N)
    {
 
        int f = 1, Sum = 0;      
        for (int i = 1; i <= N; i++) {
 
            f = f * i;
            Sum += f;
        }
        return Sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N ;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        System.out.print(findFactSum(N));
    }
}