class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n=prices.length;
        int[] res = new int[prices.length];

        
        for( int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 0;
            }else{
                res[i] = st.peek();
            }
            st.push(prices[i]);
        }
        for(int i=0;i<n;i++){
            prices[i] -=res[i];
        }
        return prices;
    }
}