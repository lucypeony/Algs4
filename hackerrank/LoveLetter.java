import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            String s=sc.nextLine();
            int len=s.length();
            int count=0;
            for(int j=0;j<len / 2 ; j++){
                char p=s.charAt(j);
                char q=s.charAt(len-j-1);
                count +=Math.abs((int)q - (int)p);
            }//for 
          System.out.println(count);  
        }//for 
    }//main
}//class 