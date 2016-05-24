import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindWord {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String[] s=new String[100];
        String test;
                                    
        int N=Integer.parseInt(sc.nextLine());
        for(int i=0;i<N;i++){
            s[i]=sc.nextLine();
        }//for
        
        int T=Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++){
            test=sc.nextLine();
            Pattern p=Pattern.compile("([\\W\\D^_]*"+test+"[\\W\\D^_]*)");
            int count=0;
            for(int j=0;j<N;j++){
                Matcher m=p.matcher(s[j]);
                while(m.find()){
                    count++;
                }//while 
                //System.out.println(m.group(0));
            }//for
            System.out.println(count);
        }//for
        
 
    }//main
}//class