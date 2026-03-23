class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(s.size()>0 && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                res[i] = s.isEmpty() ? -1 : s.peek();
            }
           
            s.push(nums[i%n]);
        }
        return res;
    }
}