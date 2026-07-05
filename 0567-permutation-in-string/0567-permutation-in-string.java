class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> mapS1 = new HashMap<>();
        HashMap<Character,Integer> mapS2 = new HashMap<>();
        int k = s1.length();
      for(char ch:s1.toCharArray()){
        mapS1.put(ch,mapS1.getOrDefault(ch,0)+1);
      }
      if (s1.length() > s2.length()) {
    return false;
}
      int l=0;
      int h=0;
      while(h<k){
        char ch = s2.charAt(h);
        mapS2.put(ch,mapS2.getOrDefault(ch,0)+1);
        h++;
      }
      if(mapS1.equals(mapS2)){
        return true;
      }
      for( h=k;h<s2.length();h++){
        char add = s2.charAt(h);
        mapS2.put(add,mapS2.getOrDefault(add,0)+1);

        char remove = s2.charAt(l);
        mapS2.put(remove,mapS2.getOrDefault(remove,0)-1);

        if(mapS2.get(remove)==0){
            mapS2.remove(remove);
        }
        l++;
        if(mapS1.equals(mapS2)){
            return true;
        }
      }
      return false;
            }
}