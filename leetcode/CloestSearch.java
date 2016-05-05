import java.util.Arrays; 
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class CloestSearch{
   static  int[] nums;
    
    public static int  find(int bp,int ep,int target){
        int res;
        if(ep-bp<2){
            if(Math.abs(nums[ep]-target)>=Math.abs(nums[bp]-target))
                return ep;
            else 
                return bp;
        }
            
        
        int mid=(ep+bp)/2;
        if(target>nums[mid]) 
            return(find(mid,ep,target));
        else if (target <nums[mid])
            return(find(bp,mid,target));
        else 
            return mid;
    // return res;   
    }
    
    
    public static  int findCloest(int target){
       
       int res=find(0,nums.length-1,target);
       return res;
    }
    
    public static void main(String[] args){
      int len=Integer.parseInt(args[0]);
      nums=new int[100];
      for(int i=0;i<len;i++)
          nums[i]=StdRandom.uniform(len);
      for(int i=0;i<len;i++)
          StdOut.print(nums[i]+"  ");
      StdOut.println();
      
      
      Arrays.sort(nums,0,len-1);
       for(int i=0;i<len;i++)
          StdOut.print(nums[i]+"  ");
      StdOut.println();
      
      int target=Integer.parseInt(args[1]);
      StdOut.println(findCloest(target));
    }
}