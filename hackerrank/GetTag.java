import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GetTag{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      ArrayList<String> list=new ArrayList<String>();
      
      
      while(testCases>0){
         String line = in.nextLine();
         
             //Write your code here
         
         Pattern r = Pattern.compile("<{1}/?(\\w+\\d?)>{1}");
         Matcher m = r.matcher(line);
         while(m.find()) {
                 String s=m.group(1);
                 if(!list.contains(s))
                        list.add(s);
                 System.out.println(s);
         }//while
        
         
         testCases--;
      }//while

   int size=list.size();
    Collections.sort(list);
    for(int i=0;i<size-1;i++)
        System.out.print(list.get(i)+";");
    System.out.print(list.get(size-1));
   }//main
   
   }//class

