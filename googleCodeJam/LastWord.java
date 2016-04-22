import java.io.*;
import java.util.*;

public class LastWord{
   

  public static void main(String[] args) throws Exception{
    String name="A-large-practice_LastWord";
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
      
      int len=s.length(),MAX=2002;
      char[] chars=new char[MAX*2+1];
      int left=MAX;
      int right=MAX+1;
      chars[left]=s.charAt(0);
      for(int i=1;i<len;i++){
          if(s.charAt(i)>=chars[left]){
              left--;
              chars[left]=s.charAt(i);
          }else{
              chars[right]=s.charAt(i);
              right++;
          }
      }
           
      for(int i=left;i<right;i++)
          pw.printf("%c",chars[i]);
      
      pw.printf("\n");
      pw.flush();
    }//end of testCases for


    pw.close();
    sc.close();
  }//end of main
}
