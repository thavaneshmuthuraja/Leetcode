class Solution {

    int [][] dir={{0,1},{1,0},{-1,0},{0,-1}};
    boolean ch=true;
    void  bfs(int r,int c,boolean [][]vis,int [][] grid)
    {
        vis[r][c]=true;
        for(int i=0;i<4;++i)
        {
            int nr=r+dir[i][0];
            int nc=c+dir[i][1];
            if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length )
            {
                if(!vis[nr][nc] && grid[nr][nc]==0)
                {
                    bfs(nr,nc,vis,grid);
                }
            }else ch=false;
        }
    }

    public int closedIsland(int[][] grid) {
        
        int cnt =0;
        int n=grid.length,m=grid[0].length;
        boolean [][] vis=new boolean [n][m];

        for(int i=1;i<grid.length-1;++i)
        {
            for(int j=1;j<grid[i].length-1;++j)
            {
                if(grid[i][j]==1 || vis[i][j]) continue;
                else 
                {   
                    ch=true;
                    bfs(i,j,vis,grid);
                    if(ch) cnt++;
                }

            }
        }
        return cnt;
    }
}