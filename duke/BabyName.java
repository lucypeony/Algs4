import edu.duke.*;
import org.apache.commons.csv.*;
import edu.princeton.cs.algs4.StdOut;

public class BabyName{
    
    public static void main(String[] args){
        FileResource fr=new FileResource();
        for(CSVRecord rec:fr.getCSVParser(false)){
            int numBorn=Integer.parseInt(rec.get(2));
            if(numBorn<=100){
                StdOut.println("Name "+rec.get(0)+
                               "Gender " +rec.get(1)+
                               "Num Born "+rec.get(2));
            }
        }//for
    }//main
    
}