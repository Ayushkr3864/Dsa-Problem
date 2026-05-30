import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int l=0;
       int n= nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int h=0;h<n;h++){
        map.put(nums[h],map.getOrDefault(nums[h],0)+1);
        while(map.get(nums[h])>1){
            int diff = Math.abs(l-h);
            if(diff<=k){
                return true;
            }
            map.put(nums[l],map.get(nums[h])-1);
            l++;
        }
       } 
       return false;
    }
}