public class ThreeSumCloest {
    public int threeSumClosest(int[] nums, int target) {
        //sort array nums 
        Array.sort(nums);
        
        int len=nums.length-1;
        while(target<nums[len])
            len--;
        
        
    }
}