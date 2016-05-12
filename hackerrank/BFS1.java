import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BFS1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int cases=Integer.parseInt(sc.nextLine());
        while(cases-->0){
            //get the input
            int V=sc.nextInt();
            int E=sc.nextInt();
            sc.nextLine();
            int[][] a=new int[E][E];
            for(int i=0;i<E;i++){
                int m,n;
                m=sc.nextInt();
                n=sc.nextInt();
                a[m][n]=1;
                sc.nextLine();
            }//for
            
            int start=sc.nextInt();
            
            for(int i=0;i<V;++){
                
            }//for 
                
            
            
        }//while 
        
    }
}