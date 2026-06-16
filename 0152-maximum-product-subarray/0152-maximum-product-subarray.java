class Solution {
    public int maxProduct(int[] nums) {
        int ans=(int)-1e9;


        int pre=1,suf=1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(suf==0)
            {
                suf=1;
            }
            pre*=nums[i];
            suf*=nums[j];
            
            ans=Math.max(ans,pre);
            ans=Math.max(ans,suf);
        }
        return ans;
    }
}