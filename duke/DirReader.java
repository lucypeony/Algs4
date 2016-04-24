
import edu.duke.*;
import java.io.File;

public class DirReader {
    public void checkDir() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
    
    
    public static void main(String[] args){
        DirReader dr=new DirReader();
        dr.checkDir();
        
        FileResource hello=new FileResource("hello_unicode.txt");
        for(String line:hello.lines()){
            System.out.println(line);
        }
    }
}
