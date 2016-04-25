import  edu.duke.*;
import org.apache.commons.csv.*;
import edu.princeton.cs.algs4.StdOut;





public class CSV{
    
    
    public static CSVRecord hottest(CSVParser parser){
    CSVRecord largestSoFar=null;
    for(CSVRecord record:parser){
        if(largestSoFar==null)
            largestSoFar=record;
        else
            if(Double.parseDouble(record.get("TemperatureF")) > Double.parseDouble(largestSoFar.get("TemperatureF")))
                 largestSoFar=record;
    }//end for 
    
    return largestSoFar;
}
    
    
    public static void main(String[] args){
        FileResource fr=new FileResource();
        CSVParser parser=fr.getCSVParser();
        CSVRecord temp=hottest(parser);
        StdOut.println("hottest temperature: "+temp.get("TemperatureF"));
        }
    }

