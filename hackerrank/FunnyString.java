import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<T;i++){
            boolean res=true;
            String s=sc.nextLine();
            int len=s.length();
            for(int j=1;j<=len/2 ;j++){
                int p=Math.abs(s.charAt(j)-s.charAt(j-1));
                int q=Math.abs(s.charAt(len-j)-s.charAt(len-j-1));
                //System.out.println(j+"  "+p+ "  "+q);
                if(p!=q){
                 res=false;
                 break;
                }
                    
            }//for 
            if(res)
                System.out.println("Funny");
            else 
                System.out.println("Not Funny");
        }//for 
    }//main 
}//class 