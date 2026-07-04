class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int one=0;
        int zero = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
          if(nums[i]==0){
            zero++;
          }else{
            one++;
          }
           int diff = zero-one;
           if(diff==0){
            max= Math.max(max,i+1);
           }
           if(map.containsKey(diff)){
            max =  Math.max(max,i-map.get(diff));
           }else{
            map.put(diff,i);
           }
        }
        return max;
    }
}