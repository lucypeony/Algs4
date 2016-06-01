import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisaWorkbook {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  sc.nextLine();
  int[] a=new int[n];
  
  int count=0;
  int sum=0;
  
  for(int i=0;i<n;i++){
   a[i]=sc.nextInt();
   
   int pages=a[i]/k;
   int mod=a[i]%k;
   
   int bp=1-k,ep=0;
   if(pages==0){
    bp=1;
    ep=mod;
    count++;
    // System.out.println("bp ep count "+bp+" : "+ep+" :"+count);
     if(count >=bp && count <=ep)
         sum++;
   }else{
    for(int j=1;j<=pages;j++){
     count++;
     bp +=k;
     ep +=k;
       //System.out.println("bp ep count "+bp+" : "+ep+" :"+count);
     if(count >=bp && count <=ep)
         sum++;
    }//for
    
    if(mod !=0){
     bp +=k;
     ep +=mod;
     count++;
      //System.out.println("bp ep count "+bp+" : "+ep+" :"+count);
     if(count >=bp && count <=ep)
         sum++;
    }
    
   }//else
  }//for
  
 // System.out.println(count);
  System.out.println(sum);
  
  
  
    }//main
}//class