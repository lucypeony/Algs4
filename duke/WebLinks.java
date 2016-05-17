import edu.princeton.cs.algs4.StdOut;
import edu.duke.*;
import java.util.regex.*;

public class WebLinks{
 
 public static String getLink(String s){
  String startTag="<a href=\"";
  int startLen=startTag.length();
  String stopTag="\"";
  
  int start = s.indexOf(startTag);
  int stop =s.indexOf(stopTag,start+startLen);
  if(start!=-1 && stop!=-1)
   return s.substring(start+startLen,stop);
  else 
      return "";
  
 }
 
 
 public static boolean ifsub(String s,String target){
  String t1=s.toLowerCase();
  String t2=target.toLowerCase();
  if(t1.indexOf(t2)!=-1)
   return true;
  else 
   return false;
 }
 
 
 public static String getContent(String url){
     URLResource urllink=new URLResource(url);
     /*
        for(String lines:urllink.lines()){
            StdOut.println(lines);
        }
        */
     String s=urllink.asString();
     return s ;
 }
 
 public static void getTag(String content){
     Pattern p=Pattern.compile("<a href='(.*?)'>");
     Matcher m=p.matcher(content);
     while(m.find()){
     // System.out.println(m.group(0));
      System.out.println(m.group(1));    
     }
 }//function
 
 
    public static void main(String[] args){
        /*
      String url="http://www.ielts-blog.com/ielts-writing-samples-essays-letters-reports/";
      URLResource urllink=new URLResource(url);
        for(String lines:urllink.lines()){
            //StdOut.println(lines);   
            String temp=getLink(lines);
            if (temp!=""){
                if(temp.indexOf("category")!=-1)
                    StdOut.println(temp);
    }//if 
    
        }//for 
        */
        
        String s=getContent("http://www.ielts-blog.com/ielts-writing-samples/ielts-essays-band-8/ielts-essay-topic-computers-instead-of-teachers/");
        getTag(s);
    }//main
}