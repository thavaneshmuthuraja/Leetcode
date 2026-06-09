class Solution {
public:
    long long maxTotalValue(vector<int>& nums, int k) {

        auto[mini,maxi]=minmax_element(nums.begin(),nums.end());

        return 1LL*(*maxi-*mini)*k;
        
    }
};