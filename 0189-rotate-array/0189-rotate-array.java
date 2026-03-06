import java.util.ArrayList;
class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        k = k%nums.length;
        if(nums.length==0 || nums.length<k ){
            return;
        }
        for(int i=nums.length-k;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<list.size();i++){
            nums[i]= list.get(i);
        }
    }
}