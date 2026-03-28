class Solution {

    int [][]dict={{0,1},{1,0},{0,-1},{-1,0}};

    void dfs (int r,int c,char [][]grid)
    {
        grid[r][c]='#';

        for(int i=0;i<4;i++)
        {
            int nr=r+dict[i][0];
            int nc=c+dict[i][1];
            if(nr<grid.length && nc<grid[0].length && nr>=0 && nc>=0 && grid[nr][nc]=='1' && grid[nr][nc]!='#')
            {
                dfs(nr,nc,grid);
            }
        }
    
    }
    public int numIslands(char[][] grid) {

        int count =0,n=grid.length,m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
}