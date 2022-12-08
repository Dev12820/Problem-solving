import java.util.*;
public class Struplo {
    public static void main(String[] args) {
        String m,x="";
    Scanner sc=new Scanner(System.in);
    m=sc.nextLine();
    int ln = m.length();
 
        // Conversion using predefined methods
        for (int i = 0; i < ln; i++) {
            char ch = m.charAt(i);
            if (Character.isUpperCase(ch))
              x += Character.toLowerCase(ch);
            else
              x += Character.toUpperCase(ch);
        }
        System.out.println(x);
    }
    
}
