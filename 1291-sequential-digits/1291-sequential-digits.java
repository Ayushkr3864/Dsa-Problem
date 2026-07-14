class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                int num = Integer.parseInt(sub);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        return list ;
    }
}