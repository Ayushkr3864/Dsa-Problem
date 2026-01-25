class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=s.length()/2;i++){
            String sub = s.substring(0,i);
            int size = Math.ceilDiv(s.length(),sub.length());
            if(s.length()%sub.length()!=0) continue;
            int j=0;
            while(j<size){
                sb.append(sub);
                j++;
            }
             if (s.compareTo(sb.toString())==0)
                return true;
            sb.setLength(0);
        }
        return false;
    }
}