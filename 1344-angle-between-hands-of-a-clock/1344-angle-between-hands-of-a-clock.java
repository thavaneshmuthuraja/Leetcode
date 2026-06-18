class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double h=30*hour;
        double md=minutes*0.5;
        double ha=h+md;
        double ma=minutes*6;

        double a=Math.abs(ha-ma);

        return Math.min(a,360-a);
    }
}