class Solution {

    List<List<String>> ans=new ArrayList<>();

    boolean check(int r,int c,boolean [][]vis)
    {
        int n=vis.length;
        boolean res=true;
        //same row back check
        for(int i=c-1;i>=0;i--)
        {
            if(vis[r][i]) res=false;
        }
        //same column top check
        for(int i=r-1;i>=0;i--)
        {
            if(vis[i][c]) res=false;
        }


        //above check for diagonal

        for(int i=r-1,j=c-1;i>=0 && j>=0 ;i--,j--)
        {
            if(vis[i][j]) res=false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<n ;i--,j++)
        {
            if(vis[i][j]) res=false;
        }

        return res;

    }

    void func(int r,int n,List<String>val,boolean [][]vis)
    {
        if(n==r) {
            ans.add(new ArrayList<>(val));
            return ;
        }

        StringBuilder temp=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            temp.append('.');
        }

        for(int i=0;i<n;i++)
        {
            if(check(r,i,vis))
            {
                temp.setCharAt(i,'Q');
                val.add(temp.toString());
                vis[r][i]=true;
                func(r+1,n,val,vis);
                val.remove(val.size()-1);
                temp.setCharAt(i,'.');
                vis[r][i]=false;
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        boolean vis[][]=new boolean [n][n];

        func(0,n,new ArrayList<>(),vis);
        return ans;
    }
}