class Solution {
    public boolean judgeSquareSum(int c) {
         long l=0,r=(long)Math.sqrt(c);
        while(l<=r)
        {
            long val=(l*l)+(r*r);
            if(val==c) return true;
            else if(val<c) l++;
            else
            r--;
        }

        return false;
    }
}