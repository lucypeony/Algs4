import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;

public class RSQ{
    private int[] b;
    private int len;
    private int[] nums;
    
    public void NumArray(int[] nums){
        this.nums=nums;
        double l= Math.sqrt(nums.length);
        len=(int)Math.ceil(nums.length/l);
        b=new int[len];
        for(int i=0;i<nums.length;i++)
            b[i/len]+=nums[i];
    }
    
    
    public  int sumRange(int i,int j){
      int sum=0;
      int startBlock=i/len;
      int endBlock =j/len;
      if(startBlock == endBlock){
       for(int k=i;k<=j;k++)
           sum+=nums[k];
      }else{
       for(int k=i;k<=(startBlock+1)*len -1;k++)
           sum +=nums[k];
       for(int k=startBlock+1;k<=endBlock-1;k++)
           sum+=b[k];
       for(int k=endBlock*len;k<=j;k++)
           sum+=nums[k];
      }
      return sum;
        
    }
    
    
    public  void update(int i,int val){
        int b_l=i/len;
        b[b_l]=b[b_l]-nums[i]+val;
        nums[i]=val;
    }
    
    
    public static void main(String[] args){
      int MAX=1000;
      int N=Integer.parseInt(args[0]);
      //get N random numbers
      int[] a=new int[MAX];
      for(int i=0;i<N;i++)
          a[i]=StdRandom.uniform(N);
      
      
      RSQ myrsq=new RSQ();
      //begin test
      
      //stop watch 
      Stopwatch sp=new Stopwatch();
      double start=sp.elapsedTime();
      
      myrsq.NumArray(a);
      for(int i=0;i<N;i++)
      {
          int temp=StdRandom.uniform(N);
          myrsq.update(i,temp);
          int temp1=StdRandom.uniform(N);
          StdOut.println(i+":  " + myrsq.sumRange(temp,temp1));
      }

     double end=sp.elapsedTime();
     double time=end-start;
     StdOut.println("time used : "+time);
      
    }
}