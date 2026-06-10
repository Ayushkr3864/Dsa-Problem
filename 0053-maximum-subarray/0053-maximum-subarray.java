class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnd = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int choice1 = bestEnd+nums[i];
            int choice2 = nums[i];
            bestEnd = Math.max(choice1,choice2);
            ans = Math.max(bestEnd,ans);
        }
        return ans;
    }
}