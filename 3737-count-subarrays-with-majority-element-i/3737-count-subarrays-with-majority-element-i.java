import java.util.*;
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res =0;
      for(int l=0;l<nums.length;l++){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int h=l;h<nums.length;h++){
            map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            int len = (h-l+1)/2;
           if(map.getOrDefault(target,0)>len){
            res++;
           }
        }
       
      }  
       return res;

    }
}