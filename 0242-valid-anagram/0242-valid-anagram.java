
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
    //   for(int i=0;i<s.length();i++){
    //     if(t.indexOf(s.charAt(i))==-1){
    //         return false;
    //     }
    //   }
    //   return true;
    char[] a = s.toCharArray();
     char[] b = t.toCharArray();

     Arrays.sort(a);
     Arrays.sort(b);
     return Arrays.equals(a,b);
    }
}