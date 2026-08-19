class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int first=-1;
        int second=-1;
        int res=-1;
        while(l<=h){
            int mid = l+(h-l)/2;
         if(nums[mid]<target){
            l=mid+1;
         }
         else if(nums[mid]>target){
            h=mid-1;
         }
         else{
            res=mid;
            h=mid-1;
         }
        }
        first = res;
        res=-1;
        l=0;
        h=nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
         if(nums[mid]<target){
            l=mid+1;
         }
         else if(nums[mid]>target){
            h=mid-1;
         }
         else{
            res=mid;
            l=mid+1;
         }
        }
        second=res;
        return new int[] {first,second};

    }
}