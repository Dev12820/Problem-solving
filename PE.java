import javax.lang.model.util.ElementScanner14;
import javax.print.event.PrintJobListener;

public class PE {
    public static void main(String[] args) {
        
        int n=5;
        int i=1;
        for(i=1;i<=n;i++)
        {
            if(i<=3)
            {
            int c=5-(i-1)*2;
            for(int j=1;j<=c;j++)
            System.out.print("*");
            
        System.out.println("");
        }
    
        else{
        
     int d=(i-2)+1;
         for(int j=d;j>=1;j--)
         {
         System.out.print("*");
         
         }
         System.out.println("");
         

    }
  

}
}
}