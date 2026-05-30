class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int l=0;
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int h=0;h<n;h++){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            while(map.get(s.charAt(h))>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            int len = h-l+1;
            res = Math.max(len,res);

        }
       
        return res;
    }
}