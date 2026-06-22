class Solution {

    int [][]dir={{0,-1},{0,1},{1,0},{-1,0}};

    public void dfs(int i,int j,char [][]grid,boolean [] []vis )
    {
        int n=grid.length;
         int m=grid[i].length;

        vis[i][j]=true;

        for(int k=0;k<4;k++)
        {
            int nr=i+dir[k][0];
            int nc=j+dir[k][1];


            if(nr<n && nr>=0 && nc<m && nc>=0 && grid[nr][nc]=='1' && !vis[nr][nc] )
            {
                dfs(nr,nc,grid,vis);
            }
        }
    } 
    public int numIslands(char [][]grid) {

        int cnt=0;
        boolean [][]vis=new boolean [grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(!vis[i][j] && grid[i][j]!='0')
                {
                   cnt++;
                   dfs(i,j,grid,vis);
                }
            }
        }

        return cnt;
    }
}