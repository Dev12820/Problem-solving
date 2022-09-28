import java.util.*;
public class S3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        float x=sc.nextInt();
        float sum =1;float no_row = 1;
	for (int i=1;i<n;i++)
	{
	  no_row =(no_row*x/(float)i);
	  sum =sum+ no_row;
	}
    System.out.println(sum);
    }
    
}
