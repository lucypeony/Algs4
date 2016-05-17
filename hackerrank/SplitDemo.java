import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitDemo{
    private static final String REGEX="\\d";
    private static final String INPUT="0one1two2three3four4five5";
    
    public static void main(String[] args){
        Pattern p=Pattern.compile(REGEX);
        String[] items=p.split(INPUT);
        for(String s:items){
            System.out.println(s);
        }//for
        
    }//main
    
    
}//class