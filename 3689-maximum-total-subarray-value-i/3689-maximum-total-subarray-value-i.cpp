class Solution {
public:
    long long maxTotalValue(vector<int>& nums, int k) {

        long long maxi=LLONG_MIN,mini=LLONG_MAX;
        
        for(int i=0;i<nums.size();i++)
        {
            maxi=max(maxi,(long long)nums[i]);
            mini=min(mini,(long long)nums[i]);
        }

        return (maxi-mini)*k;
        
    }
};