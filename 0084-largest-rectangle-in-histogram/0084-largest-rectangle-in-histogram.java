class Solution {
    public int largestRectangleArea(int[] heights) {
        int curr = 0;
        int max = 0;
        Stack<Integer> s = new Stack<>();
        int currHeight;
        for(int i=0;i<=heights.length;i++){
           if(i==heights.length){
             currHeight = 0;
           }
           else{
             currHeight = heights[i];
           }
           while(!s.isEmpty() && currHeight< heights[s.peek()]){
            int height = heights[s.pop()];
              int width;
           if(s.isEmpty()){
            width = i;
           }
           else{
            width = i-s.peek()-1;
           }
           max= Math.max(max,height*width);
           }
         
           s.push(i);
        }
        return max;
    }
}