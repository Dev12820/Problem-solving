import java.util.*;
public class Wordcount {
    public static void main(String[] args) {
        String m;
    Scanner sc=new Scanner(System.in);
    m=sc.nextLine();
    count(m);
    }
    static void count(String m)
    {
        int c=0;
        //char ch[]=m.toCharArray();
        for(int i=0;i<m.length()-1;i++)
        {
        if(m.charAt(i)==' ' && m.charAt(i+1)!=' ')
         c++;
        }
        c++;
        System.out.print(c);
    }
    
}
