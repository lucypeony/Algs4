import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {
    private ArrayList<Integer>[] seqList;
    int lastAns=0;
    int N;
    DynamicArray(int N){
     this.N=N;
     seqList=new LinkedList<Integer>[N];   
    }
    
    public void query(int a,int x,int y){
        
        int index=(x^lastAns)%N;
        
        if(a==1){
            seqList[index].add(y);   
        }//if a==1 
        else{
            
           // lastAns=value;
            System.out.println(seqList[index].get(y % index));
            
        }//else a==2 
    }//method 
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        
        DynamicArray myclass=new DynamicArray(N);
        
        sc.nextLine();
        for(int i=0;i<Q;i++){
            int a,x,y;
            a=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
            myclass.query(a,x,y);
            sc.nextLine();
        }//for
        
    }//main
}//class