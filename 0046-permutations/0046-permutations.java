class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] present = new boolean[nums.length];
        backtrack(nums,present,new ArrayList<>(),list);
        return list;
    }
    private void backtrack(int[] nums, boolean[] present,List<Integer> current,List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(present[i]){
                continue;
            }
            present[i] = true;
            current.add(nums[i]);

            backtrack(nums,present,current,result);

            current.remove(current.size()-1);
            present[i] = false;
        }
    }
}