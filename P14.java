import java.util.*;
public class P14
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=1;i<=input;i++){
            System.out.print("*");
        }
        for(int i=2;i<=input-1;i++){
            System.out.println();
            for(int j=1;j<=(input-i);j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=input;i++){
            System.out.print("*");
        }
        

    }
}

	

