import java.io.*;
import java.util.*;

public class BFF{


  public static void main(String[] args) throws Exception{
    String name="file name ";
    String path="";//file path

    Locale.setDefault(Locale.US);

    Scanner sc=new Scanner(new File(path+name+".in"));
    PrintWriter pw=new PrintWriter(path+name+".out");

    int testCases=sc.nextInt();
    int MAX=1001;
    int[] a=new int[MAX];
    for(int testCase=1;testCase<=testCases;testCase++){
      /*
       sc.nextInt();
       sc.nextDouble();
       sc.next()---String
      */
        `int N=sc.nextInt();
        for(int i=1;i<N;i++){
            a[i]=sc.nextInt();
        }
        
        


      //output
      pw.printf("Case #"+testCase+": ");

      pw.printf("\n");
      pw.flush();
    }//end of testCases for


    pw.close();
    sc.close();
  }//end of main
}
