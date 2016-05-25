/*
 * 
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
 */

public class ReverseString {
    public String reverseString(String s) {
        if(s=="")
            return "";
        int len=s.length();
        char[] cstr=new char[len];
        for(int i=0;i<len;i++){
            cstr[i]=s.charAt(len-i-1);
        }//for 
        
        String res=new String(cstr);
        return res;
    }//method
    
    public  static void main(String[] args){
        String s="";
        ReverseString rs=new ReverseString();
        System.out.println(rs.reverseString(s));
    }//main
}