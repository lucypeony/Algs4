import edu.duke.*;
import java.io.File;


public class BatchInversions{
    public BatchInversions(){
    }
    
    public ImageResource makeInversion(ImageResource inFile){
        ImageResource outFile=new ImageResource(inFile.getWidth(),inFile.getHeight());
        for(Pixel outPixel:outFile.pixels()){
            Pixel inPixel=inFile.getPixel(outPixel.getX(),outPixel.getY());
            outPixel.setRed(255-inPixel.getRed());
            outPixel.setBlue(255-inPixel.getBlue());
            outPixel.setGreen(255-inPixel.getGreen());
        }
        
        return outFile;
    }
    
    
    public void selectAndInversion(){
        DirectoryResource dr=new DirectoryResource();
        for(File f:dr.selectedFiles()){
            ImageResource ir=new ImageResource(f);
            String name=f.getName();
            ImageResource outf=makeInversion(ir);
            String newName="images/inverted-"+name;
            outf.setFileName(newName);
            outf.draw();
            outf.save();
        }
    }
    
    
    
    
    public static void main(String[] args){
        BatchInversions bi=new BatchInversions();
        bi.selectAndInversion();
    }
        
}