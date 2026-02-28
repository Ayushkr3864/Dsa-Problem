import java.util.ArrayList;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       ArrayList<Integer> list = new ArrayList<>();
       int i = 0;
       int j = 0;
       while(j <n){
        if(i<m  &&nums1[i]<=nums2[j]   ){
            list.add(nums1[i]);
            i++;
        }
        // if(nums1[i]==nums2[j]){
        //     list.add(nums[i]);
        //     i++;
        // }
          else{
            list.add(nums2[j]);
            j++;
        }
       }
           while (i < m) {
            list.add(nums1[i]);
            i++;
        }

        // add remaining nums2 elements
        while (j < n) {
            list.add(nums2[j]);
            j++;
        }
       for(int k = 0;k<list.size();k++){
        nums1[k] = list.get(k);
       }
    }
}