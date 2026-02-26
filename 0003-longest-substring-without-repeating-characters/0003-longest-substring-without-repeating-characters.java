class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int left = 0;
        int max = 1;
        int curr = 1;
        String sub = s.substring(0,1);
        
        for(int right =1;right<s.length();right++){
              sub = s.substring(left,right+1);
               while(sub.indexOf(s.charAt(right))!=sub.length() - 1){
                left++;
                sub = s.substring(left, right + 1);
            }
          
            curr = right-left+1;
            max = Math.max(curr,max);
          
        }
        return max;
    }
}