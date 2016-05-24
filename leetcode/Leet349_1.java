import java.util.*;

class Leet349_1{
    public static int[] intersection(int[] nums1,int[] nums2){
       int len1=nums1.length;
       int len2=nums2.length;
       //sort the array
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       
       int p=0,q=0;
       ArrayList<Integer> res=new ArrayList<Integer>();
       
       while(true){
           //while(p>0 && p<len1 && nums1[p]==nums1[p-1] ) p++;  //remove the duplicated 
           //while(q>0 && q<len2 && nums2[q]==nums2[q-1]) q++;   
           
           if( p==len1 || q==len2) break;
           
           if(nums1[p]<nums2[q]) p++;
           else if (nums1[p]>nums2[q]) q++;
           else {
               res.add(nums1[p]);
               p++;q++;      
           }
       }///while
               
           if(res.size()==0)
               return (new int[0]);
           
           
           //convert ArrayList to int[]
           int[] ret=new int[res.size()];
           for(int i=0;i<ret.length;i++){
               ret[i]=res.get(i);
           }
           
           return ret;
       }
       
       
    
     public static void main(String[] args){
        int[] nums1={1,2,3,3,3,4};
        int[] nums2={1,3,3};
        int [] nums=intersection(nums1,nums2);
        int len=nums.length;
        for(int i=0;i<len;i++){
         System.out.print(nums[i]+"  ");   
        }
    }//main
    
}//class