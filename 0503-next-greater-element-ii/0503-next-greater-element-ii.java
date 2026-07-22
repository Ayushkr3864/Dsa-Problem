class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i=nums.length-2;i>=0;i--){
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] =-1;
            }
            else{
                res[i]= nums[st.peek()];
            }
            st.push(i);
        }
        return res;


    }
}