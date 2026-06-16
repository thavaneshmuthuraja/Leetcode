class Solution {
    public int[] searchRange(int[] nums, int target) {

    int ans[]=new int [2];
    int l=0,h=nums.length-1;
    int a1=-1,a2=-1;

    while(l<=h)
    {
        int mid=(l+h)/2;

        if(nums[mid]==target)
        {
            a1=mid;
            h=mid-1;
        }else if(nums[mid]>target)
        {
            h=mid-1;
        }else
        {
            l=mid+1;
        }
    }

    l=0;
    h=nums.length-1;
    while(l<=h)
    {
        int mid=(l+h)/2;

        if(nums[mid]==target)
        {
            a2=mid;
            l=mid+1;
        }else if(nums[mid]>target)
        {
            h=mid-1;
        }else
        {
            l=mid+1;
        }
    }
        ans[0]=a1;
        ans[1]=a2;
        return ans;

    }
}