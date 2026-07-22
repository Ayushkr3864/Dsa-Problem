class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int end=n-1;
        int start =0;
        while(end>0 && nums[end-1]<=nums[end]){
            end--;
        }

        if(end==0){
            return 0;
        }
        while(start<n-1 && nums[start+1]>=nums[start]){
            start++;
        }
            int min = nums[start];
        int max = nums[start];

        for (int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while (start > 0 && nums[start - 1] > min) {
            start--;
        }

        while (end < n - 1 && nums[end + 1] < max) {
            end++;
        }

        return end-start+1; 
    }
}