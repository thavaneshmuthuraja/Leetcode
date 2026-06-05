class Solution {
public:

    vector<vector<int>>dir={{1,0},{0,1},{-1,0},{0,-1}};

    int func(int r,int c,vector<vector<int>>& mat,vector<vector<int>>& mem)
    {
        int best=1;

        if(mem[r][c]!=-1) return mem[r][c];

        for(int i=0;i<dir.size();i++)
        {
            vector<int>val=dir[i];
            int nr=r+val[0];
            int nc=c+val[1];
            if(nr>=0 && nr<mat.size() && nc>=0 && nc<mat[0].size() && mat[r][c]<mat[nr][nc])
            {

                best= max(best,1+func(nr,nc,mat,mem));

            }


        }
        return mem[r][c]=best;
    }

    int longestIncreasingPath(vector<vector<int>>& matrix) {

        vector<vector<int>>mem(matrix.size(),vector<int>(matrix[0].size(),-1));

        int ans=0;

        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix[0].size();j++)
            {
                ans=max(ans,func(i,j,matrix,mem));
            }
        }
        return ans;
    }
};