class Solution {
    public int maxRepeating(String sequence, String word) {
         int k = 0;
        String s = word;
        // for (int i = 0; i <= sequence.length(); i++) {
        //     if ((i + 1) % word.length() != 0) {
        //         continue;
        //     }
        //     s = s.concat(word);
        //     System.out.println(s);
        //     if (sequence.contains(s)) {
        //         k = k + 1;
        //     }
        while(sequence.contains(s)){
            k++;
            s = s.concat(word);
        } 
        return k;
    }
}