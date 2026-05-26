 import java.util.Arrays;
class Solution {
   
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
       int strt=0;
     while(strt < nums.length && nums[strt] < 0){
    strt++;
}
    int split = strt;
       int[] neg = new int[split];
         for (int i = 0; i < split; i++) {
            neg[i] = nums[split - 1 - i] * nums[split - 1 - i];
        }
        int[]  pos = new int[nums.length-split];
       for(int i=0;i<pos.length;i++){
        pos[i] = nums[split+i]*nums[split+i];
        strt++;
       }
       int i=0;
       int j=0;
       int id=0;
       while(i<neg.length && j<pos.length){
        if(neg[i]<pos[j]){
            res[id] = neg[i];
            i++;
            id++;
        }
        else{
            res[id] = pos[j];
            j++;
            id++;
        }
       }
       while(i<neg.length){
        res[id++] = neg[i++];
       }
       while(j<pos.length){
        res[id++]= pos[j++];
       }
        return res;
    }
}