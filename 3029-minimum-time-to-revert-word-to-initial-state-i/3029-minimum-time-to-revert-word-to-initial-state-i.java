class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();

        for (int t = 1; t * k < n; t++) {
            int shift = t * k;
            boolean ok = true;

            for (int i = shift; i < n; i++) {
                if (word.charAt(i) != word.charAt(i - shift)) {
                    ok = false;
                    break;
                }
            }

            if (ok) return t;
        }

        
        return (n + k - 1) / k;
    }
}
