class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
    int sum =0;
    int n = nums.length;
    int res = Integer.MAX_VALUE;
        for(int high =0;high<n;high++){
            sum = sum+nums[high];
             
            while(sum>=target){
                 res = Math.min(high-low+1,res);
                sum = sum-nums[low];
                low++;
            }
         
          
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}