class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> s;

        for (int i=0;i<nums.size();i++)
        {
            s.insert(nums[i]);
        }
        int ans=0,count=1;
        long long prev=-1e12;
        for(int x:s)
        {
            if(prev!=-1e12)
            {
                
                if(x-prev==1)
                {
                    count++;
                }else if(prev-x==-1)
                {
                    count++;
                }else
                {
                    count=1;
                }
            }
            prev=x;
            ans=max(count,ans);

        }

    return ans;
    }
};