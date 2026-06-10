class Solution {
public:
    vector<int> getRow(int r) {
        vector<vector<int>>ans;

        for(int i=0;i<=r;i++)
        {
            ans.push_back(vector<int>(i+1));
            for(int j=0;j<=i;j++)
            {
                if(i==0||j==0||j==i)
                {
                    ans[i][j]=1;
                }else{
                    
                    ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
                }
            }
        }

        return ans[r];
    }
};