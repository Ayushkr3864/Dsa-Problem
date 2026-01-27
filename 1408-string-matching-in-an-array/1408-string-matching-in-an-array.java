class Solution {
    public List<String> stringMatching(String[] words) {
          List<String> List = new ArrayList<>();
          Arrays.sort(words,(a,b)->a.length()-b.length());
          for (int i = 0; i < words.length; i++) {
             
              int j = i+1;
              while (j<words.length) {
                String match = words[j];
                    if (words[j].contains(words[i])) {
                    List.add(words[i]);
                    break;
                }
                    j++;
                }
              }
          if(List.isEmpty()) return new ArrayList<>();
          return List;
    }
}