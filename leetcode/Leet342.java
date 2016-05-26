import java.util.regex.*;

public class Leet342 {
    public boolean isPowerOfFour(int num) {
        String s=Integer.toBinaryString(num);
        Pattern p=Pattern.compile("1(00)*");
        Matcher m=p.matcher(s);
        
        boolean res;
        
        if(m.matches())
            res=true;
        else
            res=false;
        
        return res;
    }//method 
    
    public static void main(String[] args){
        Leet342 myclass=new Leet342();
        System.out.println(myclass.isPowerOfFour(3));
    }//main 
}