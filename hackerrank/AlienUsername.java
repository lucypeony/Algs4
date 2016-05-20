import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlienUsername {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        Pattern p=Pattern.compile("^[_.][0-9]+[a-zA-Z]*[_]{0,1}$");
        
        while(n>0){
            String s=sc.nextLine();
            Matcher m=p.matcher(s);
            if(m.matches())
                System.out.println("VALID");
            else
                System.out.println("INVALID");
            
            n--;
        }//while
    }
}