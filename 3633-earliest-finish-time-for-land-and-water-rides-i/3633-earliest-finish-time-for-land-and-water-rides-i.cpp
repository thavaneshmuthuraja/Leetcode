class Solution {
public:
    int earliestFinishTime(vector<int>& landStartTime, vector<int>& landDuration, vector<int>& waterStartTime, vector<int>& waterDuration) {

        int ans=1e9;

        for (int i=0;i<landStartTime.size();i++)
        {
            for(int j=0;j<waterStartTime.size();j++)
            {
                int val=landStartTime[i]+landDuration[i];
                if(val<waterStartTime[j])
                {
                    int t=waterStartTime[j]-val;
                    val+=t;
                }
                val+=waterDuration[j];
                ans=min(val,ans);
            }
        }

        for (int i=0;i<waterStartTime.size();i++)
        {
            for(int j=0;j<landStartTime.size();j++)
            {
                int val=waterStartTime[i]+waterDuration[i];
                if(val<landStartTime[j])
                {
                    int t=landStartTime[j]-val;
                    val+=t;
                }
                val+=landDuration[j];
                ans=min(val,ans);
            }
        }

        return ans;
        
    }
};