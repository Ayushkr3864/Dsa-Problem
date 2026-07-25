class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();

        while(n>0){
            list.add(n%10);
            n /=10;
        }
        int l=0;
        int r = list.size()-1;
        
        int max =0;
        while(l<r){
           int curr = list.get(l)*list.get(r);
           max = Math.max(curr,max);
           if(list.get(l)<list.get(r)){
            l++;
           }else{
            r--;
           }
        }
        return max;
    }
}