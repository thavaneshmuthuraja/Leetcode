class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int st=0,end=0,n=nums.length,mfreq=0,ans=0;
        Map<Integer,Integer> mp=new HashMap<>();
        while(end<n)
        {
            mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);

            mfreq=mp.get(nums[end]);
            if(mfreq>k)
            {
                while(mp.get(nums[end])>k && st<n)
                {
                    mp.put(nums[st],mp.getOrDefault(nums[st],0)-1);
                    st++;
                }
            }
            ans=Math.max(ans,end-st+1);
            end++;
        }

        return ans;
    }
}