class Solution {
public:
    bool isZeroArray(vector<int>& nums, vector<vector<int>>& queries) {
        vector<int> dif(nums.size()+1,0);

        for(auto temp: queries)
        {
            int l=temp[0];
            int r=temp[1];

            dif[l]-=1;
            dif[r+1]+=1;
        }
        int sum=0;

        for(int i=0;i<nums.size();i++)
        {
            sum+=dif[i];
            if(nums[i]>abs(sum)) return false;
        }
        return true;
    }
};