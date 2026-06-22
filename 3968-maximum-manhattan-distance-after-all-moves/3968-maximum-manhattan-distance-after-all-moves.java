class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,cnt=0;
        for(int i=0;i<moves.length();i++)
        {
            char c=moves.charAt(i);

            if(c=='U') y++;
            else if(c=='D')y--;
            else if(c=='L')x--;
            else if(c=='R')x++;
            else cnt++;
        }
        return Math.abs(x)+Math.abs(y)+cnt;
    }
}