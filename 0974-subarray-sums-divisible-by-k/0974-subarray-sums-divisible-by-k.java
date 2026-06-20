import java.util.HashMap;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int rem = 0;
        map.put(0,1);
        int res =0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            rem = ((sum%k)+k)%k;
           
            int freq = map.getOrDefault(rem,0);
            res = res+freq;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return res;
    }
}