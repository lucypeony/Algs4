    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;


    public class String_token {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          //Complete the code
          Pattern pattern = Pattern.compile("[a-zA-Z]");
          
          String[] sa=new String[100];
          sa=s.split(pattern);
          
          System.out.println(sa);
                                        
                                        

        }
    }
