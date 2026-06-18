class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,ans=(int)1e9;
        while(l<=h)
        {
            int mid=(l+h)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]<=nums[h])
            {
                h=mid-1;
            }else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}