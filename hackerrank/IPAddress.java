import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IPAddress {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s=sc.nextLine();
            
            //my regex : ((\\d)|([1-9]\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5])\\.){3}((\\d)|([1-9]\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))
            Pattern ipv4=Pattern.compile("^(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))$");
            Matcher ipv4m=ipv4.matcher(s);
            
            
            Pattern ipv6=Pattern.compile("([[0-9a-z]{0,3}[0-9a-f]:]{7}[[0-9a-z]{0,3}[0-9a-f]])");
            Matcher ipv6m=ipv6.matcher(s);
            
            String sout;
            
            if(ipv4m.find()){
                sout="IPv4";
            }
            else{
                if(ipv6m.matches()){
                    sout="IPv6";
                }
                else{
                    sout="Neither";
                }
                
            }//else
            
            System.out.println(sout);
        }//while 
        
    }//main
}//class 