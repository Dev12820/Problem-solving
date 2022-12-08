import java.util.*;
public class Mean {
    public static void main(String[] args) {
        Mean();
        
    }
    public static void Mean()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        ar[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<5;i++)
        sum+=ar[i];
        int mean=sum/5;
        int median=ar[2];
        System.out.print(mean+" "+median);
    }
    
}
