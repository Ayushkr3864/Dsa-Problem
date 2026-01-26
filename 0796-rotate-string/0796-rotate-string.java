class Solution {
    public boolean rotateString(String s, String goal) {
         StringBuilder sb = new StringBuilder();
          // return false;
          
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            sb.append(s2);
            sb.append(s1);
            if (goal.compareTo(sb.toString()) == 0) {
                return true;
            } else {
                sb.setLength(0);
            }
        }
        return false;  
    }
}