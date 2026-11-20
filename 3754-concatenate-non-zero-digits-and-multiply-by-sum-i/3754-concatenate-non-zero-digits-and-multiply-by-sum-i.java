class Solution {
    public long sumAndMultiply(int n) {
        long num =0;
        long x=0;
        long sum = 0;
        while(n>0){
            long rem = n%10;
            if(rem>0){
                num = num*10+rem;
            }
            n=n/10;
        }
        x = rev(num);
        while(num>0){
            sum +=num%10;
            num /=10;
        }
        return x>0?x*sum:0;
    }
    public long rev (long x){
        long num =0;
        while(x>0){
            long rem = x%10;
            num = num*10+rem;
            x = x/10;
        }
        return num;
    }
}