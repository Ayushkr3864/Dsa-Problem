class Solution {
    public int smallestNumber(int n, int t) {
        
       
        int res =1;
        for(int i=n;i<=100;i++){
             int product =1;
             int num =i;
            while(num>0){
                 product =product*(num%10); 
                 if(product==0) break;
                 num /=10;
            }
              if(product%t==0){
                    res = i;
                    break;
                 }
        }
        return res;
    }
}