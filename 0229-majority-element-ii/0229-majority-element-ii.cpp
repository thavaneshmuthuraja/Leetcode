class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {

        int cnt1=0,cnt2=0,el1,el2;

        for(int i=0;i<nums.size();i++)
        {
           if(cnt1>0 && nums[i]==el1)
           {
            cnt1++;
           }else if(cnt2>0 && nums[i]==el2)
           {
            cnt2++;
           }
           else if(cnt1==0)
           {
            el1=nums[i];
            cnt1=1;

           }else if(cnt2==0)
           {
            el2=nums[i];
            cnt2=1;

           }else 
           {
            cnt1--;
            cnt2--;
           }
        }

        cnt1=0;
        cnt2=0;

        int ch=nums.size()/3;

        for(int i=0;i<nums.size();i++)
        {
            if(el1==nums[i]) cnt1++;
            if(el2==nums[i]) cnt2++;
        }

        vector<int>ans;

        if(cnt1>ch && el1!=el2) ans.push_back(el1);
        if(cnt2>ch) ans.push_back(el2);

        return ans;
        
    }
};