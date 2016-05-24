/**
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede". 
 */

class Leet345{
    
    private static boolean isVowel(char c){
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
          return true;
      else
          return false;
    }
    
     public static String reverseVowels(String s) {
        int len=s.length();
        
        char[] schar=s.toCharArray();
        //System.out.println(":"+new String(schar)+":");
        
        int bp=0,ep=len-1;
        while(true){
            if(bp>=len-1) break;
            if(ep<=0) break;
            System.out.println(bp);
            while(!isVowel(schar[bp]) && bp<len-1) bp++;
            while(!isVowel(schar[ep]) && ep>0) ep--;
            
            if(bp<ep){
                char temp=schar[bp];
                schar[bp]=schar[ep];
                schar[ep]=temp;
                bp++;ep--;
                //System.out.println(schar[bp]+" "+schar[ep]);
            }else{
                break;
            }//if 
        }//while 
        
        String res=new String(schar);
        return res;
    }//method 
     
     public static void main(String[] args){
         String s="OE";
         System.out.println(reverseVowels(s));
         
     }//main
}