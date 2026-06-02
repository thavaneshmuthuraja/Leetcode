class Solution {
public:

    void rev(vector<int>& nums,int l,int r)
    {
        while(l<r)
        {
            swap(nums[l],nums[r]);
            l++;
            r--;
        }
    }
    void nextPermutation(vector<int>& nums) {

        int n=nums.size(),ind=-1;
        //find break point 

        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
// edge case if lost permutation give
        if(ind==-1)
        {
            rev(nums,0,n-1);
            return;
        }
// find next greater for ind place
        for(int i=n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                swap(nums[i],nums[ind]);
                break;
            }
        }

        rev(nums,ind+1,n-1);
        
    }
};