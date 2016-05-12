import java.io.*;
import java.util.*;

public class Anagrams{
    private static final int MAX=60;

   static boolean isAnagram(String A, String B) {
      char[] ac=new char[MAX];
      A=A.toLowerCase();
      ac=A.toCharArray();
      Arrays.sort(ac);
      
     //System.out.println(ac);
      
      char[] bc=new char[MAX];
      B=B.toLowerCase();
      bc=B.toCharArray();
      Arrays.sort(bc);
      
      //System.out.println(bc);
      
      if(Arrays.equals(ac,bc))
          return true;
      else 
          return false;
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
