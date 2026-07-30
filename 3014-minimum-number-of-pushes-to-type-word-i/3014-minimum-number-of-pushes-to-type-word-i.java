class Solution {
    public int minimumPushes(String word) {
        int n=word.length(),moves=1,ans=0;

        while(n>0)
        {
            if(n>=8)
            {
                ans+=moves*8;
            }else
            {
                ans+=moves*n;
            }
            moves++;
            n-=8;

        }

        return ans;
    }
}