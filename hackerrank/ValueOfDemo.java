public class ValueOfDemo{
    public static void main(String[] args){
        
        if(args.length == 2){
            float a=(Float.valueOf(args[0])).floatValue();
            float b=(Float.valueOf(args[1])).floatValue();
            
            System.out.format("%.3f%n  %.3f%n",a,b);
            
            
        }//if 
    
    
    }//main
}//class