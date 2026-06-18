class Solution {
    public double angleClock(int hour, int minutes) {
       double hourAngle = (hour!=12?hour*30:0) + (double)minutes*0.5;
       double minutesAngle =  (double)minutes*6;
       double actualAngle = Math.abs(hourAngle-minutesAngle);
       double res= Math.min(360-actualAngle,actualAngle);
       return res; 
    }
}