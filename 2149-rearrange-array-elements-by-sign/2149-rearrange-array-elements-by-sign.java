import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
         }
         int[] res = new int[nums.length];
         for(int i=0;i<nums.length/2;i++){
            res[2*i]= list1.get(i);
            res[2*i+1] = list2.get(i);
         }
         return res;
    }
}