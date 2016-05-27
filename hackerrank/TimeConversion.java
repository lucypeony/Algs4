import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        Pattern p=Pattern.compile("(\\d\\d):(\\d\\d:\\d\\d)(\\wM)");
        Matcher m=p.matcher(time);
        
        String str1="",str2="",str3="";
        while(m.find()){
            str1=m.group(1);
            str2=m.group(2);
            str3=m.group(3);
        }//while
        
        int str1_1=Integer.parseInt(str1);
        
        if(str1_1==12){
           if(str3.charAt(0)=='A')
               str1_1=0;
          
        }else{
            if(str3.charAt(0)=='P'){
                str1_1  +=12;
            }
             
        }
       System.out.format("%02d"+":"+str2,str1_1); 
      
    }//main
}