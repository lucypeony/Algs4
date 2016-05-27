import java.util.*;
public class Leet290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words=str.split(" ");
        if(words.length !=pattern.length()){
            return false;
        }//if
        
        Map<Character,String> dict=new HashMap();
        Set<String> set=new HashSet();
        
        for(int i=0;i<words.length;++i){
            char c=pattern.charAt(i);
            if(!dict.containsKey(c)){
                if(!set.add(words[i])){
                    return false;
                }//if
                dict.put(c,words[i]);
            }else if(!dict.get(c).equals(words[i])){
                return false;
            }//if
        }//for
        return true;
    }//method
    
    public static void main(String[] args){
        String p="abba";
        String str="dog cat cat dog ";
        Leet290 myclass=new Leet290();
        System.out.println(myclass.wordPattern(p,str));
    }//main
    
}//class