class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums1.length;i++){
            int j = nums2.length-1;
            while(j>0 && nums2[j]!=nums1[i]){
                if(nums2[j]>nums1[i]){
 s.push(nums2[j]);
                }
               
                j--;
            }
            if(s.isEmpty()){
                res[i]= -1;
            }
            else{
                res[i]= s.peek();
            }
            while(s.size()>0){
                s.pop();
            }
        }
        return res;
    }
}