import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String[] s=new String[100];
        String[] target=new String[10];
        
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
            s[i]=sc.nextLine();
        int k=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<k;i++){
           target[i]=sc.nextLine();
        
        int count=0;
        Pattern p=Pattern.compile("[\\w\\d_]"+target[i]+"[\\w\\d_]");
        for(int j=0;j<n;j++){
        Matcher m=p.matcher(s[j]);
        while(m.find()){
            count++;
        }//while
        }//for
        System.out.println(count);  
        }//for 
    }
}