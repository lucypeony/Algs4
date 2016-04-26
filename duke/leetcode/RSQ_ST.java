/*
 * Range Sum Query implemented in Segement Tree 
 */
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;

public class RSQ_ST{
    int[] tree;
    int n;
    
    private void buildTree(int[] nums){
        for(int i=n,j=0;i<2*n;i++,j++)
            tree[i]=nums[j];
        for(int i=n-1;i>0;--i)
            tree[i]=tree[i*2]+tree[i*2+1];
    }//build tree
    
    
    public void NumArray(int[] nums){
        if(nums.length >0){
            n=nums.length;
            tree=new int[n*2];
            buildTree(nums);
        }//if 
    }//numArray
    
    public void update(int pos,int val){
        pos+=n;
        tree[pos]=val;
        while(pos>0){
            int left=pos;
            int right=pos;
            if(pos%2==0)
                right=pos+1;
            else
                left=pos-1;
            tree[pos/2]=tree[left]+tree[right];
            pos /=2;
        }//while
    }//update
    
    public int sumRange(int l,int r){
        l +=n;
        
        r +=n;
        int sum=0;
        while(l <=r){
            if((l % 2) == 1){
                sum+= tree[l];
                l++;
            }
            if((r % 2)==0){
                sum +=tree[r];
                r--;
            }
            l /=2;
            r /=2;
        }//while
        return sum;
        
    }//sumRange
    
    
    
     public static void main(String[] args){
      int MAX=1000;
      int N=Integer.parseInt(args[0]);
      //get N random numbers
      int[] a=new int[MAX];
      for(int i=0;i<N;i++)
          a[i]=StdRandom.uniform(N);
      
      
      RSQ_ST myrsq=new RSQ_ST();
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