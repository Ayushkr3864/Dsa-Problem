class Solution {
    public int prefixCount(String[] words, String pref) {
         int count = 0;
        for (int i = 0; i < words.length; i++) {
            // if (words[i].length() < pref.length()) {
            //     continue;
            // }
            String word = words[i];
            if (word.startsWith(pref)) {
                count += 1;
            }
        }
        return count; 
    }
}