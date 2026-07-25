class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max =0;
        for(int freq:map.values()){
            if(freq>=2){
                max =max+ (freq-(freq%2));
            }
            
        }
        if(max==s.length()){
            return max;
        }
       
        return max+1;
    }
}