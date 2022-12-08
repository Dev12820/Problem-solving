import java.util.Scanner;

public class Matrix180 {
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
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=ar[a-1-i][b-1-j];
            }
        }
        for(int j=0;j<b;j++)
        {
            for(int i=a-1;i>=0;i--)
            {
            
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
    }
}
