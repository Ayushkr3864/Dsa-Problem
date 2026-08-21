class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
      
        list1.add(nums[0]);
        list2.add(nums[1]);
        int k=2;
        while(k<nums.length){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[k]);
                k++;
            }else{
                list2.add(nums[k++]);
            }
        }
        
        int[] res = new int[nums.length];
        for(int i=0;i<list1.size();i++){
            res[i]=list1.get(i);
        } 
         for (int i = 0; i < list2.size(); i++) {
            res[list1.size() + i] = list2.get(i);
        }
        return res;
    }
}