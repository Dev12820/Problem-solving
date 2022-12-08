import java.util.*;
public class Palstr {
  public static void main(String[] args) {
    String m;
    Scanner sc=new Scanner(System.in);
    m=sc.next();
    palstr(m);
  }  
  static void palstr(String m)
  {
    String reversestr="";
          for (int i = (m.length() - 1); i >=0; --i) {
            reversestr = reversestr + m.charAt(i);
          }
      
          if (m.toLowerCase().equals(reversestr.toLowerCase())) {
            System.out.println(m + " is a Palindrome String.");
          }
          else {
            System.out.println(m + " is not a Palindrome String.");
          }
        }
      } 
