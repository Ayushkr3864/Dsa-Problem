class Solution {

    private class Pair{
        char ch;
        int count;

        Pair(char ch, int count){
            this.ch = ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for(char c:s.toCharArray()){
            if(!st.isEmpty() &&st.peek().ch==c){
                if(st.peek().count==k-1){
                    st.pop();
                }else{
                    st.peek().count++;
                }
            }else{
                st.push(new Pair(c,1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            for(int i=0;i<st.peek().count;i++){
                sb.append(st.peek().ch);
            }
            st.pop();
        }
        return sb.reverse().toString();
    }
}