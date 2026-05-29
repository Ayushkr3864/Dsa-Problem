class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     
       int n = nums.length;
       int count = 0;
      int Product = 1;
      int l=0;
      if(k<=1){
        return 0;
      }
      for(int i=0;i<n;i++){
        Product *=nums[i];
        while(Product>=k ){
            Product /=nums[l];
            l++;
        }
        count +=(i-l+1); 
      }
       return count; 
    }
}