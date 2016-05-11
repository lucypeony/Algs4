import java.io.*;
import java.util.*;

public class Solution2{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length()+B.length();
        System.out.println(len);
        String ans;
        if(A.compareTo(B)>=1 )
            ans="yes";
        else
            ans="no";
        
        System.out.println(ans);
        
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        
        char a1,b1;
        a[0]=Character.toTitleCase(A.charAt(0));
        b[0]=Character.toTitleCase(B.charAt(0));
        System.out.println(String.valueOf(a)+" "+String.valueOf(b));
        
      
        
        
        
    }
}
