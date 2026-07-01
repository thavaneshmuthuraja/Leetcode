class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0,h=nums.length-1,ans=0;

        while(l<=h)
        {
            int mid=(l+h)/2;

            int p= mid-1>=0 ? nums[mid-1]:Integer.MIN_VALUE;
            int f= mid+1<n ? nums[mid+1]:Integer.MIN_VALUE;


            if(p<nums[mid] && nums[mid]>f)
            {
                ans=mid;
                l=mid+1;
            }else if(p>nums[mid])
            {
                h=mid-1;
            }else {
                l=mid+1;
            }
        }

        return ans;
        
    }
}