class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> mapMagazine = new HashMap<>();
         HashMap<Character,Integer> mapRansom = new HashMap<>();
        for(char ch:magazine.toCharArray()){
            mapMagazine.put(ch,mapMagazine.getOrDefault(ch,0)+1);
        }

        for(char ch:ransomNote.toCharArray()){
            mapRansom.put(ch,mapRansom.getOrDefault(ch,0)+1);
        }

        for(char ch:ransomNote.toCharArray()){
           if(!mapMagazine.containsKey(ch)){
            return false;
           }
             if(mapRansom.get(ch)>mapMagazine.get(ch)){
                return false;
            }
            }
          
        
        return true;
    }
}