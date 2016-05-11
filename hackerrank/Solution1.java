import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            int a,b,n;
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            int res=a;
            int x=0;
            while(x<n){
                int temp=(int)Math.pow(2.0,x)*b;
                res=res+temp;
                System.out.print(res+" ");
                x++;
            }//while n 
            System.out.println();
            if(sc.hasNextLine())
              sc.nextLine();
            else 
                break;
        }//for i
    }
}