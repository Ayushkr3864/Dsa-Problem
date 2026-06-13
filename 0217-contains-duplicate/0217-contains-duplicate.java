import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i])>1){
        //         return true;
        //     }
        // }
        // Arrays.sort(nums);
        // int l=0;
        // int r = 1;
        // while(r<nums.length){
        //     if(nums[l]==nums[r]){
        //         return true;
        //     }
        //     l++;
        //     r++;
        // }

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}