import java.util.HashMap;
class Solution {
    public int characterReplacement(String s, int k) {
           int l=0;
        int maxFreq = 0;
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        for(int h=0;h<n;h++){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(h)));
            while(((h-l+1)-maxFreq)>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,h-l+1);
        }
        return res ;
    }
}