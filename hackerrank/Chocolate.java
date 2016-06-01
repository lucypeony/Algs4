import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
   
   int count=0;int sum=0;
   count=n/c;
   sum=n/c;
   
   while(count >=m){
    int a=count % m;
    int b=count / m;
    sum +=b;
    count=a;
    count +=b;
   }//while 
   
   System.out.println(sum);
        }//get input 
    }//main 
}//class 
