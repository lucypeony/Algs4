import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 The Performace Test for Class ST
**/

public class FrequencyCounter{
 public static void main(String[] args){
  int minlen=Integer.parseInt(args[0]);
   SequentialSearchST<String,Integer> st=new  SequentialSearchST<String,Integer>();
  while(!StdIn.isEmpty())
  {
   //Build Symbol table and count frequencies 
   String word = StdIn.readString();
   if(word.length()<minlen) continue;
   if(!st.contains(word)) st.put(word,1);
   else        st.put(word,st.get(word)+1);
    
  }
  
  //Find a key with the highest frequency count
  String max="";
  st.put(max,0);
  for(String word:st.keys())
   if(st.get(word)>st.get(max))
    max=word;
  StdOut.println(max+" "+st.get(max));
 }//main
}//class 