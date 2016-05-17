import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            if(sc.hasNextLine()){
                String s=sc.nextLine();
                int len=s.length();
               for(int j=0;j<len;j=j+2)
                   System.out.print(s.charAt(j));
               
               System.out.print(" ");
               
               for(int j=1;j<len;j=j+2)
                   System.out.print(s.charAt(j));
                System.out.println();
            }//if
        }//for 
    }
}