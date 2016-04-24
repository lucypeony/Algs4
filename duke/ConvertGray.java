import edu.duke.*;
import java.io.File;
//import edu.princeton.cs.algs4.StdDraw;

public class ConvertGray{
    public ConvertGray(){
    }
    
    /*
     * Convert image to gray scale 
     */
    public  ImageResource makeGray(ImageResource inImage){
        ImageResource outImage=new ImageResource(inImage.getWidth(),inImage.getHeight());
        
        for(Pixel pixel:outImage.pixels()){
            Pixel inPixel=inImage.getPixel(pixel.getX(),pixel.getY());
            int average=(inPixel.getRed()+inPixel.getBlue()+inPixel.getGreen())/3;
            pixel.setRed(average);
            pixel.setBlue(average);
            pixel.setGreen(average);
        }
        return outImage;
    }
    
    
    /*
     * batch 
     */
    public void selectAndConvert(){
      DirectoryResource dr=new DirectoryResource();
        for(File f:dr.selectedFiles()){
            ImageResource inFile=new ImageResource(f);
            ImageResource gray=makeGray(inFile);
            
            String fname=inFile.getFileName();
            String newName="gray-"+fname;
            gray.setFileName(newName);
            gray.draw();
            gray.save();
            
        }
    }
    
    
    
    
    public static void main(String[] args){
        ConvertGray cg=new ConvertGray();
        cg.selectAndConvert();
    }
}