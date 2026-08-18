class Solution {

    int [][]dir= {{0,1},{1,0},{-1,0},{0,-1}};

    boolean func(int in,int r,int c,char [][] b,String w,boolean[][] vis)
    {
        if(in==w.length()) return true;
        int m=b.length,n=b[0].length;

        char cur=w.charAt(in);

        for(int i=0;i<4;i++)
        {
            int nr=r+dir[i][0];
            int nc=c+dir[i][1];
            if(nr>=0 && nc>=0 && nr<m && nc<n && !vis[nr][nc] && b[nr][nc]==cur)
            {
                vis[nr][nc]=true;
                if(func(in+1,nr,nc,b,w,vis)) return true;
                vis[nr][nc]=false;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String w) {
        int m=board.length,n=board[0].length;
        boolean vis[][]=new boolean [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                char t=w.charAt(0);
                if(t==board[i][j])
                {
                    vis[i][j]=true;
                    if(func(1,i,j,board,w,vis)) return true;
                    vis[i][j]=false;
                }
            }
        }
        return false;
    }
}