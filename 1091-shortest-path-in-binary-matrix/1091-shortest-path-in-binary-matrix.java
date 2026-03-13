class Solution {

    int [][]dir={{1,1},{1,-1},{1,0},{-1,1},{0,1},{-1,0},{0,-1},{-1,-1}};

    class Pair
    {
        int row,col;

        Pair(int r,int c)
        {
            row=r;
            col=c;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n=grid.length,m=grid[0].length,ans=1;

        boolean[] []vis=new boolean [n][m];

        if(grid[0][0]==1||grid[n-1][m-1]==1) return -1;
        
        if(grid.length==1 && grid[0][0]==0) return 1;
     
                    Queue<Pair> q=new LinkedList<>();

                    q.add(new Pair(0,0));
                    vis[0][0]=true;



                    while(!q.isEmpty())
                    {
                        int sz=q.size();
                        ans++;
                        for(int t=0;t<sz;t++)
                        {
                            Pair cur=q.poll();
                            int r=cur.row;
                            int c=cur.col;

                            for(int k=0;k<8;k++)
                            {
                                int nr=dir[k][0]+r;
                                int nc=dir[k][1]+c;

                                if(nr<n && nc<m && nr>=0 && nc>=0 && grid[nr][nc]==0 && !vis[nr][nc])
                                {
                                    if(nr==n-1 && nc==m-1) return ans;
                                    q.add(new Pair(nr,nc));
                                    vis[nr][nc]=true;
                                }
                            }

                        }
                    }

    return -1;
        
    }
}