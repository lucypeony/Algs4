import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HTMLLinks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int cases=Integer.parseInt(sc.nextLine());
        while(cases>0){
            String line=sc.nextLine();
            
            Pattern p=Pattern.compile("<a href=\"(.*?)\".*?>([\\w ,./]*)(?=</)");
            Matcher m=p.matcher(line);
            while(m.find()){
                System.out.print(m.group(1)+",");
                System.out.println(m.group(2));
            }//while
            
            cases--;
        }//while 
    }
}