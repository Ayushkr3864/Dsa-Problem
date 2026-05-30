import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
            int l=0;
       int n= fruits.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       int res =0;
       for(int h=0;h<n;h++){
        map.put(fruits[h],map.getOrDefault(fruits[h],0)+1);
        while(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);
            if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
            }
            l++;
        }
        if(map.size()<=2){
            int len = h-l+1;
             res = Math.max(len,res);
        }
       }
       return res;
    }
}