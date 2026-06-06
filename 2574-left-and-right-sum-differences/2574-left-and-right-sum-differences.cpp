class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {

        vector<int>p(nums.size(),0);
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums[i];
            p[i]=sum;
        }
        int n=nums.size()-1;

        for(int i=0;i<nums.size();i++)
        {
            int val= i-1<0 ? 0:p[i-1];
            int right=p[n]-val;
            cout<<right;
    
            nums[i]=abs(right-p[i]);
        }

        return nums;
        
    }
};