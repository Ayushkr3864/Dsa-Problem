class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            int prevoneDelete = onedelete;
            int prevNodelete = nodelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            int choice;
            if(onedelete ==Integer.MIN_VALUE){
                choice = arr[i];
            }
            else{
                choice = prevoneDelete+arr[i];
            }
            onedelete = Math.max(prevNodelete,choice);
            res=Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;
    }
}