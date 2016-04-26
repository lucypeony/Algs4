import edu.princeton.cs.algs4.StdOut;
import edu.duke.*;


public class WordPlay{
    
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
          ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
          )
            return true;
        else
            return false;
    }
    
    public String replaceVowels(String phrase, char ch){
        StringBuilder s=new StringBuilder();
        s.setLength(phrase.length());// set Length()
        for(int i=0;i<phrase.length();i++){
            char temp=phrase.charAt(i);
         if(isVowel(temp))
             s.setCharAt(i,ch);
         else
             s.setCharAt(i,temp);
        }
        return s.toString();
    }
    
    
    public static void main(String[] args){
      String source=args[0];
      WordPlay wp=new WordPlay();
      String temp=wp.replaceVowels(source,'+');
      StdOut.println(temp);
    }
    
}