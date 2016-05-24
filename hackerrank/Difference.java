//import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
   private int[] elements;
   public int maximumDifference;
  
   Difference(int[] a){
       this.elements=a;
   }//constructor 
    
   public void computeDifference(){
       int max=0;
       for(int i=0;i<elements.length;i++){
           for(int j=i+1;j<elements.length;j++){
               int temp=Math.abs(elements[i]-elements[j]);
               if (temp>max)
                   max=temp;
           }
       }//for
       maximumDifference=max;
   }//computeDifference

      public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Difference D = new Difference(a);

                D.computeDifference();

               System.out.print(D.maximumDifference);
            }//main       
   
}//class