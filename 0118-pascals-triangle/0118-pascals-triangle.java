import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
               if(i==j || j==0){
                list.add(1);
               }
               else{
               int element = res.get(i-1).get(j-1) + res.get(i-1).get(j);
               list.add(element);
               }
            }
             res.add(list);
        }
      return res;
    }
}