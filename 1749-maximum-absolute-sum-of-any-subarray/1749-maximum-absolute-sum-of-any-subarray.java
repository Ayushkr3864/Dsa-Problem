class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int Max_Sum = Integer.MIN_VALUE;
        int Max_End = 0;
        int Min_Sum = Integer.MAX_VALUE;
        int Min_End = 0;
        for(int x :nums){
            Max_End = Math.max(Max_End+x, x);
            Min_End = Math.min(Min_End+x,x);
            Max_Sum = Math.max(Max_Sum,Max_End);
            Min_Sum = Math.min(Min_Sum,Min_End);
        }
        return Math.max(Math.abs(Max_Sum),Math.abs(Min_Sum));
    }
}