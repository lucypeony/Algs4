import java.util.Scanner;
import java.util.regex.*;

public class SyntaxChecker
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
         try{
             Pattern p;
            p=Pattern.compile(pattern);
             System.out.println("Valid");
         }//try
         catch(PatternSyntaxException e) {
             System.out.println("Invalid");
         }//catch
         
      }
   }
}
