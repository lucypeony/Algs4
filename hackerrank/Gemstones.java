import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        
        Set<Character> mySet=new HashSet<Character>();
        Set<Character> res=new HashSet<Character>();
        res.clear();
        for(int i=0;i<N;i++){
            mySet.clear();
            String s=sc.nextLine();
            //char[] schar=s.toCharArray();
            for(int j=0;j<s.length();j++)
                mySet.add(s.charAt(j));
            if(i==0)
                res.addAll(mySet);
            else
                res.retainAll(mySet);
            
           
            Iterator<Character> c=res.iterator();
            while(c.hasNext()){
             System.out.print(c.next()+"  ");
            }//while 
            System.out.println("------end ");
           
        }//for 
        
        System.out.println(res.size());
    }
}