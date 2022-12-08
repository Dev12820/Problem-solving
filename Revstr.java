import java.util.*;
public class Revstr {

    public static void main(String[] args) {
        String m;
        Scanner sc=new Scanner(System.in);
        m=sc.next();
        revstr(m);
    }
    static void revstr(String m)
    {
        char[] ch = new char[m.length()];
        for (int i = 0; i < m.length(); i++) {
            ch[i] = m.charAt(i);
        }
        for (int i = ch.length - 1; i >= 0; i--)
            System.out.print(ch[i]);

    }
    
}
