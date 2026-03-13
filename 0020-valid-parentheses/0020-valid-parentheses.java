class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '(' || s.charAt(i)== '{' ||s.charAt(i)== '['){
                stc.push(s.charAt(i));
            } 
            else{
                if(stc.size()==0){
                    return false;
                }
                if((stc.peek() == '(' && s.charAt(i) == ')') || (stc.peek() == '{' && s.charAt(i) == '}') || (stc.peek() == '[' && s.charAt(i)==']')){
                    stc.pop();
                }
                else{ return false;}
            }
        }
        return stc.isEmpty();
    }
}