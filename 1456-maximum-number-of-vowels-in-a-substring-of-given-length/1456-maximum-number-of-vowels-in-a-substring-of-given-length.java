class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int l=0;
        int h=0;
        int max =0;
        int curr=0;
        while(h<k){
            char ch = s.charAt(h);
            sb.append(ch);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                curr++;
            }
            h++;
        }
        max = curr;
        while(h<s.length()){
            char removed = s.charAt(l);
            if(removed =='a'||removed=='e'|| removed == 'i'||removed=='o'||removed=='u'){
                curr--;
            }
            sb.deleteCharAt(0);
            char added = s.charAt(h);
            sb.append(added);
             if(added =='a'||added=='e'|| added == 'i'||added=='o'||added=='u'){
                curr++;
            }
            h++;
            l++;
            max = Math.max(max,curr);
        }
        return max;
    }
}