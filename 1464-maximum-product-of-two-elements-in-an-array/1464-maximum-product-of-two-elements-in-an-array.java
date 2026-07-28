class Solution {
    public int maxProduct(int[] nums) {
       int l=0;
       int r=nums.length-1;
       int max=0;
       while(l<r){
        int curr = (nums[l]-1)*(nums[r]-1);
        max = Math.max(curr,max);
        if(nums[l]<nums[r]){
            l++;
        }
        else{
            r--;
        }
       } 
       return max;
    }
}