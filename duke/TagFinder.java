import edu.princeton.cs.algs4.StdOut;
import edu.duke.*;
import java.io.File;

public class TagFinder{
     
    public static boolean findProtein(String s){
     String startCodon="ATG";
     String stopCondon="TGA";
     int start=s.indexOf(startCodon);
     if (start>-1){
         int stop=s.indexOf(stopCondon);
         if(stop>-1){
           int diff=stop-start;
           if(diff%3==0)
               return true;
         }
     }
         return false;
    }
    
    
    
    public static void main(String[] args){
        String s = args[0];
        if(findProtein(s))
            StdOut.println("True");
    }//main
}

