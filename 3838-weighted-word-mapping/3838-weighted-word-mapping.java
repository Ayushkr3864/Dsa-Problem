class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int weight = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                int pos = s.charAt(j)-'a';
                weight +=weights[pos];
            }
            weight %=26;
            sb.append((char)('z'-weight));
            weight = 0;
        }
        return sb.toString();
    }
}