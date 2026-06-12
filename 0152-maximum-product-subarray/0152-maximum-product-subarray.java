class Solution {
    public int maxProduct(int[] nums) {
      int bestMin = nums[0];
      int bestMax = nums[0];
      int res = nums[0];
      for(int i=1;i<nums.length;i++){
       int c1 = bestMin*nums[i];
       int c2 = bestMax*nums[i];
       int c3 = nums[i];
       bestMax = Math.max(c1,Math.max(c2,c3));
       bestMin = Math.min(c1,Math.min(c2,c3));
       res = Math.max(res,Math.max(bestMax,bestMin));

      }
      return res;
    }
}