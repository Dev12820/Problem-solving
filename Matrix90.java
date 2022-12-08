import java.util.*;
public class Matrix90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ar[][]=new int[a][b];
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            ar[i][j]=sc.nextInt();
        }
        for(int j=0;j<b;j++)
        {
            for(int i=a-1;i>=0;i--)
            {
            
            System.out.print(ar[i][j]+" ");
            }
            System.out.println();
    }
}
}
