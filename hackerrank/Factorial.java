import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {
    
    
    public static int  factorial(int n){
        if(n<=1){
            return 1;
        }//if
        else{
            return factorial(n-1)*n;
        }//else
    }//factorial
        
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        System.out.println(factorial(n));
        
    }
}