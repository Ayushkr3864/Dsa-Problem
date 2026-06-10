import java.util.*;
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();

        int i=0;
        char res='\0';
        while(i<s.length()){
            if(seen.contains(s.charAt(i))){
                res = s.charAt(i);
                break;
            }
            seen.add(s.charAt(i));
            i++;
        }
        return res;
    }
}