import java.util.*;
public class Day8_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        System.out.println("1 ");
        for(int i=1;i<ar.length;i++)
        {
        for(int j = 2; j<ar[i] ; j++) {
            while(ar[i]%j == 0) {
              //System.out.println(j+" ");
               ar[i] = ar[i]/j;
            }
         }
         if(ar[i] >2) {
            System.out.println(ar[i]);
         }
    }
}
    
}
