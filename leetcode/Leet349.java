import java.util.*;
class Leet349{
    public static int[] intersection(int[] nums1,int[] nums2){
        int m = nums1.length, n = nums2.length;
        if (m == 0 || n == 0) return (new int[0]);

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<Integer>();

        int p = 0, q = 0;
        while (true) {
            while (p > 0 && p < m && nums1[p] == nums1[p-1]) p++;
            while (q > 0 && q < n && nums2[q] == nums2[q-1]) q++;
            if (p == m || q == n) break;

            if (nums1[p] < nums2[q]) p++;
            else if (nums1[p] > nums2[q]) q++;
            else {
                res.add(nums1[p]);
                p++; q++;
            }
        }

        if (res.size() == 0) return (new int[0]);
        int[] resa = new int[res.size()];
        for (int i = 0; i < resa.length; i++)
            resa[i] = res.get(i);

        return resa;
    }
    
    
    public static void main(String[] args){
        int[] nums1={1,2,3,4};
        int[] nums2={1,3};
        int [] nums=intersection(nums1,nums2);
        int len=nums.length;
        for(int i=0;i<len;i++){
         System.out.print(nums[i]+"  ");   
        }
    }//main
}//class