import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceSearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        int[] a =new int[n];
        int i;
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==target)
                break;
        }//for
            
        System.out.println(i);
        
    }
}