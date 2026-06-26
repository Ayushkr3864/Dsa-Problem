class Solution {
    public static int rev(int n){
        int rev =0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n /=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long count =0;
         int MOD = 1000000007;
        for(int i=0;i<nums.length;i++){
           int key = nums[i]-rev(nums[i]);
            count = (count+map.getOrDefault(key,0))%MOD;
            map.put(key,map.getOrDefault(key,0)+1);

        }
        return (int)count;
    }
}