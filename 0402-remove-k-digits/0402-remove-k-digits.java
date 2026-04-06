class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!s.isEmpty() && k>0 && (num.charAt(i)-'0')<(s.peek()-'0')){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while(k>0){
            s.pop();
            k--;
        }
        if(s.isEmpty()) return "0";
          StringBuilder res = new StringBuilder();
        while(!s.isEmpty()){
           res.append(s.pop());
        }
         res.reverse();
           int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }

        String result = res.substring(i);

        return result.isEmpty() ? "0" : result;
       
    }
}