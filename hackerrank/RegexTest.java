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
                Pattern.compile(regex);//��һ���ַ�������Ϊһ��������ʽ�����͵Ĺ����п��ܻ��׳��쳣�����ʱ�򣬾���Ҫtry/catch

            Matcher matcher = 
                pattern.matcher(s);    //��pattern������ʽȥƥ��ĳ���ַ���

            boolean found = false;
            while (matcher.find()) {    //ɨ��������ַ�����������һ������pattern
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
 
