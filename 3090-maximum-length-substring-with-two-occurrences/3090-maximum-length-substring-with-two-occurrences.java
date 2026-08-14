class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max =0;
        int l=0;
        for(int h=0;h<s.length();h++){
            char ch = s.charAt(h);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            int curr = h-l+1;
            max=Math.max(max,curr);
        }
        return max;
    }
}