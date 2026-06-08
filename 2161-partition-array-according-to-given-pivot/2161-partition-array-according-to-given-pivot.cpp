class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {

        vector<int> ans(nums.size());
        int l=0,r=nums.size()-1;
        int i=l,j=r;

        while(i<nums.size())
        {
            if(nums[i]<pivot)
            {
                ans[l++]=nums[i];
            }
            if(nums[j]>pivot)
            {
                ans[r--]=nums[j];
            }
            i++;
            j--;
        }

        while(l<=r)
        {
            ans[l]=pivot;
            l++;
        }

        return ans;
    }
};