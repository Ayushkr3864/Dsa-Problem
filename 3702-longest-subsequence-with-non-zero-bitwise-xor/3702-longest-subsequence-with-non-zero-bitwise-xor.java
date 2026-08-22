class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = nums[0];
        boolean hasNonZero=false;
        for(int i=1;i<nums.length;i++){
            xor ^=nums[i];

            if(nums[i]!=0){
                hasNonZero=true;
            }
        }
        if(xor>0){
            return nums.length;
        }
      else if(hasNonZero){
        return nums.length-1;
      }
      return 0;
        
    }
}