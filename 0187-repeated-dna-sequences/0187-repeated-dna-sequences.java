class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub = s.substring(i,10+i);

            if(!seen.add(sub)){
                repeated.add(sub);
            }
        }
        return new ArrayList(repeated);
    }
}