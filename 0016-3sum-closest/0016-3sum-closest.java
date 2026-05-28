import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int maxDiff = Integer.MAX_VALUE;
        int n= nums.length;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int currSum = nums[i]+nums[l]+nums[r];
                int diff = Math.abs(currSum-target);
                if(diff<maxDiff){
                    maxDiff = diff;
                    res = currSum;
                }
                if(currSum == target){
                    l++;
                    r--;
                }
                else if(currSum>target){
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        return res;
    }
}