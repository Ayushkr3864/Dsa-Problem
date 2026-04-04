class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftG = new int[n];
        int[] rightG = new int[n];
          leftG[0] =  height[0];

        for(int i = 1;i<n-1;i++){
            leftG[i] = Math.max(leftG[i-1],height[i]);
        }
        rightG[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            rightG[i] = Math.max(rightG[i+1],height[i]);
        }
        int ans = 0;
        for(int i=0;i<n-1;i++){
            ans = ans +( Math.min(leftG[i],rightG[i])-height[i]);
        }
        return ans;
    }
}