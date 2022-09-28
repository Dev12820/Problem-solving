import java.util.*;
public class S5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int n =sc.nextInt();
        int sum = 0;
        for (int i = 1, j = 1; i <= n; i = i + 2, j++)
        {
            if (j % 2 == 0)
            sum -= Math.pow(x, i);
            else
            sum += Math.pow(x, i);
        }
        System.out.println("Sum of the series is " + sum);
    }
    
}
