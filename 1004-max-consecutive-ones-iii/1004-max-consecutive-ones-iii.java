import java.util.HashMap;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int n = nums.length;
        int res =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int h=0;h<n;h++){
            map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            while(map.getOrDefault(0, 0) >k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            res = Math.max(res,h-l+1);
        }
        return res;
    }
}