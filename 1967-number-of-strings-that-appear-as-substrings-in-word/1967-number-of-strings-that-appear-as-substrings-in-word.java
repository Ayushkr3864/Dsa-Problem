class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        // int[] patterns = new int[];
        for(int i=0;i<patterns.length;i++){
            if(word.indexOf(patterns[i])>-1){
                count++;
            }
        }
        return count;
    }
}