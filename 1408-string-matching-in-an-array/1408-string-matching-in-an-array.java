class Solution {
    public List<String> stringMatching(String[] words) {
          List<String> List = new ArrayList<>();
          for (int i = 0; i < words.length; i++) {
              String s = words[i];
              int j = 0;
              while (j<words.length) {
                String match = words[j];
                    if(j==i) {
                        j++;
                        continue;
                    };
                    if (match.contains(s)) {
                        List.add(s);
                        break;
                    }
                    j++;
                }
              }
          if(List.isEmpty()) return new ArrayList<>();
          return List;
    }
}