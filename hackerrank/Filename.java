public class Filename {
    private String fullPath;
    private char pathSeparator, 
                 extensionSeparator;

    public Filename(String str,char sep,char ext){
        fullPath=str;
        pathSeparator=sep;
        extensionSeparator=ext;
    }
    
    public String extension(){
        int dot =fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot+1);
    }
    
    public String filename(){
        int sep=fullPath.lastIndexOf(pathSeparator);
        int ext=fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(sep+1,ext);
    }
    
    public String path(){
        int dot=fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0,dot);
    }
}