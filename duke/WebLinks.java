import edu.princeton.cs.algs4.StdOut;
import edu.duke.*;

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
 
    public static void main(String[] args){
      String url="http://www.dukelearntoprogram.com/course2/data/manylinks.html";
      URLResource urllink=new URLResource(url);
        for(String lines:urllink.lines()){
          //StdOut.println(lines);   
		  String temp=getLink(lines);
		  if (temp!=""){
			  if(ifsub(temp,"Youtube")){
			      StdOut.println(temp);
			  }
			
		  }//if 
    
        }//for 
    }//main
}