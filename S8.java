import java.util.*;
public class S8 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i * (i + 1) * (i + 2);
            System.out.print(sum);
    }
    
}
