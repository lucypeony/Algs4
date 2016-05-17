import java.util.regex.Pattern;
import java.util.regex.Matcher;
 import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args){
        String regex;
        Scanner sc=new Scanner(System.in);
        regex=sc.nextLine();
        
        String s=sc.nextLine();
        
            Pattern pattern = 
                Pattern.compile(regex);//把一个字符串解析为一个正则表达式，解释的过程中可能会抛出异常，这个时候，就需要try/catch

            Matcher matcher = 
                pattern.matcher(s);    //用pattern正则表达式去匹配某个字符串

            boolean found = false;
            while (matcher.find()) {    //扫描输入的字符串，查找下一个符合pattern
                System.out.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),      //returns the input sequence captured by the previous match
                    matcher.start(),      //Returns the start index of the previous match
                    matcher.end());       //returns the offset after the last character matched . 
                found = true;
            }
            if(!found){
               System.out.format("No match found.%n");
            }
        }//main
}//class
 
