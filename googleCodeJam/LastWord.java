import java.io.*;
import java.util.*;

public class LastWord{
    
    public static char[] Solve(String s){
        char[] chars=new char[2002];
       int len=s.length();
       int left=1001;
       int right=1002;
       chars[left]=s.charAt(0);
       char pivot=chars[left];
       for(int i=1;i<len;i++){
           char temp;
            temp=s.charAt(i);
           if( temp>pivot) {
               chars[left--]=temp;
               pivot=temp;
       }
           else{
               chars[right++]=temp;
           }
       }//end of for
       
       return chars;
    }

  public static void main(String[] args) throws Exception{
    String name="A-small-practice_LastWord";
    String path="";//file path

    Locale.setDefault(Locale.US);

    Scanner sc=new Scanner(new File(path+name+".in"));
    PrintWriter pw=new PrintWriter(path+name+".out");

    int testCases=sc.nextInt();
    for(int testCase=1;testCase<=testCases;testCase++){
      /*
       sc.nextInt();
       sc.nextDouble();
       sc.next()---String
      */




      //output
      pw.printf("Case #"+testCase+": ");
     
      String s=sc.next(); 
      
       char[] chars=new char[2002];
       int len=s.length();
       int left=1001;
       int right=1002;
       chars[left]=s.charAt(0);
       char pivot=chars[left];
       for(int i=1;i<len;i++){
           char temp;
            temp=s.charAt(i);
           if( temp>pivot) {
               chars[left--]=temp;
               pivot=temp;
       }
           else{
               chars[right++]=temp;
           }
       }//end of for
           
      for(int j=0;j<2002;j++)
          if(chars[j]==' ')
              pw.printf("%c",chars[j]);
      
      pw.printf("\n");
      pw.flush();
    }//end of testCases for


    pw.close();
    sc.close();
  }//end of main
}
