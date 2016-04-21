import java.io.*;
import java.util.*;


public class Template {

    private static int  min(int m,int n){
        if(m<=n)
            return m ;
        else
            return n;
    }


 public static void main(String[] args) throws Exception {
  String name = "D-large-practice_fractals";
  String path = "";

  Locale.setDefault(Locale.US);

  Scanner sc = new Scanner(new File(path + name + ".in"));
  PrintWriter pw = new PrintWriter(path + name + ".out");
//  Scanner sc = new Scanner(System.in);
//  PrintWriter pw = new PrintWriter(System.out);

  int testCases = sc.nextInt();
  for (int testCase = 1; testCase <= testCases; testCase++) {
      int k,c,s;
      k=sc.nextInt();
      c=sc.nextInt();
      s=sc.nextInt();
      
      int size;
      long tiles[]=new long[10000];

      if(c*s <k){
          pw.printf("Case #" + testCase + ": IMPOSSIBLE "+"\n");
          pw.flush();
          continue;
      }
      else {
         size=0;
          for(int i=1;i<k+1;i=i+c){
              long  p=1;
              for(int j=0;j<c;j++){
                  p=(p-1)*k + min(i+j,k);
              }
              tiles[size]=p;
              size++;
          }
          pw.printf("Case #" + testCase + ": ");
          for(int i=0;i<size;i++)
              pw.printf(tiles[i]+" ");
          pw.printf("\n");
          pw.flush();

      }
}
       pw.close();
      sc.close();
 }

}
