class Solution {
    public int maxProduct(int[] nums) {
        int currP=1;
        int maxP=Integer.MIN_VALUE;
          
            for(int i=0;i<nums.length;i++){
            currP*=nums[i];
            maxP=Math.max(maxP,currP);
            if(currP==0){
                currP=1;
            }
        }
         currP=1;
        for(int i=nums.length-1;i>=0;i--){
              currP*=nums[i];
            maxP=Math.max(maxP,currP);
            if(currP==0){
                currP=1;
            }
        }
        return maxP;
    }
}