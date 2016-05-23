import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Consecutive1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String s=Integer.toBinaryString(n);
        int len=s.length();
        int temp=0;int max=0;
        
        while(len>0){
            if(s.charAt(len-1)=='1'){
                temp++;
            }//if
            else{
                //f=false;
                if(temp>max)
                    max=temp;
                temp=0;
            }//else
            
                
            len--;
        }
        if(temp>max)
            max=temp;
       
        System.out.println(s+" "+max);
    }
}
