class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        
        for(int a:asteroids){
            boolean destroyed = false;
            while(!s.isEmpty() && a<0 && s.peek()>0){
                int sum = a+s.peek();
                if(sum>0){
                    destroyed = true;
                    break;
                }else if(sum==0){
                    destroyed = true;
                    s.pop();
                    break;
                }else{//sum<0
                   s.pop(); // top element destroyed
                }
               
            }
             if(!destroyed){
                    s.push(a);
                }
        }
         int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }

        return res;

    }
}