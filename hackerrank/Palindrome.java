import java.io.*;
import java.util.*;

public class Palindrome{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length();
        boolean flag=true;
        for(int i=0;i<len /2 ;i++){
            char c1,c2;
            c1=A.charAt(i);
            c2=A.charAt(len-i-1);
           // System.out.println(c1+"  "+c2);
            int res=Character.compare(c1,c2);
            if(res!=0){
                flag=false;
                break;
            }//if
                
        }//for 
        
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
