import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pythagorean {
    
    public static void solve(long P){
       long res=0;
       long x=1;
       long y=1;
       while(x+y<P){
           long xnew=3*x+4*y;
           long ynew=2*x+3*y;
           
           x=xnew;
           y=ynew;
           
           res +=P /(x+y);
       }//while
       System.out.println(res);
        
    }//solve
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //get input 
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long P=sc.nextLong();
            if(sc.hasNextLine())
                sc.nextLine();
            
            solve(P);
        }//while 
        
        
        
        
    }//main
}//class 