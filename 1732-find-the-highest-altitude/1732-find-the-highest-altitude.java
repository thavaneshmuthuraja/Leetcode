class Solution {
    public int largestAltitude(int[] gain) {

        int pre=0;
        int ans=0;
        for(int i=0;i<gain.length;i++)
        {
            pre+=gain[i];
            ans=Math.max(ans,pre);
            
        }

        return ans;
        
    }
}