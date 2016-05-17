import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(x%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if(x>=2 || x<=5)
              ans="Not Weird";
          if(x>=6 || x<=20)
              ans="Weird";
          if(x>20)
              ans="Not Weird";
      }
      System.out.println(ans);
   }
}
