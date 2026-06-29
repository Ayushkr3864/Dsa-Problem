class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];

        for(int i=0;i<bookings.length;i++){
            diff[bookings[i][0]-1] += bookings[i][2];
            if(bookings[i][1]<n){
                diff[bookings[i][1]] -=bookings[i][2];
            }  
        }
        int prefix = 0;
        for(int i=0;i<diff.length;i++){
            prefix +=diff[i];
            diff[i] =prefix;
        }
        return diff;
    }
}