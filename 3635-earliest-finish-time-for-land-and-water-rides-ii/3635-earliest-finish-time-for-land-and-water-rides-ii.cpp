class Solution {
public:

int func (vector<int>&ls,vector<int>&ld,vector<int>&ws,vector<int>&wd)
{
    int minst=INT_MAX;

    for(int i=0;i<ls.size();i++)
    {
        minst=min(ls[i]+ld[i],minst);
    }

    int finst=INT_MAX;

    for(int i=0;i<ws.size();i++)
    {
        finst=min(finst,max(minst,ws[i])+wd[i]);
    }
    return finst;

}
    int earliestFinishTime(vector<int>& landStartTime, vector<int>& landDuration, vector<int>& waterStartTime, vector<int>& waterDuration) {

return min(func(landStartTime,landDuration,waterStartTime,waterDuration),func(waterStartTime,waterDuration,landStartTime,landDuration));


        
    }
};