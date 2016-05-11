import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCom{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        
        int len=s.length();
        String mins,maxs;
        mins=s.substring(0,k);
        maxs=s.substring(0,k);
        // System.out.println("mins maxs: "+mins+" "+maxs);
        for(int i=1;i<len-k+1;i++){
            String temp=s.substring(i,i+k);
            int res=temp.compareTo(mins);
            if(res<0)
                mins=temp;
            res=temp.compareTo(maxs);
            if(res>0)
                maxs=temp;
             //System.out.println("temp: "+temp);
            //System.out.println("mins maxs: "+mins+" "+maxs);
        }//for
        System.out.println(mins);
        System.out.println(maxs);
    }
}