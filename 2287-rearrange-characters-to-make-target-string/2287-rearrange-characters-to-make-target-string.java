class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> targetMap = new HashMap<>();
        for(char ch:s.toCharArray()){
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }

         for(char ch:target.toCharArray()){
            targetMap.put(ch,targetMap.getOrDefault(ch,0)+1);
        }

           int min = Integer.MAX_VALUE;

        for (char ch : targetMap.keySet()) {

            if (!sMap.containsKey(ch)) {
                return 0;
            }

            int possible = sMap.get(ch) / targetMap.get(ch);

            min = Math.min(min, possible);
        }

        return min;
    
    }
}