class Solution {
    public int repeatedStringMatch(String a, String b) {
      int count =0;
      String s = "";
      while (s.length()<b.length()+a.length()) {
            s = s.concat(a);
            count += 1;
            if (s.indexOf(b)!=-1) {
                return count;
        }
      }
      return -1;  
    }
}