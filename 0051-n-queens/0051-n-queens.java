class Solution {

    List<List<String>> res=new ArrayList<>();

    boolean check(boolean [][]vis,int r,int c)
    {
        int len=vis.length;
        

        for(int i=0;i<len;i++)
        {
            if(c!=i && vis[r][i]) return false;
            if(r!=i && vis[i][c]) return false;
        //System.out.println("come");
        }
        //right diagonal
        int tr=r,tc=c;
        while(tr>=0 && tc>=0)
        {
            if( tr!=r && tc!=c && vis[tr][tc]) return false;
            tr--;
            tc--;
        //System.out.println("come");
        }
        
        tr=r;tc=c;

        while(tr>=0 && tc<len)
        {
            if(tr!=r && tc!=c && vis[tr][tc]) return false;

            tr--;
            tc++;
        //System.out.println("come");
        }
        return true;
    }

    void func(int r,int n,boolean  [][]vis)
    {
        if(r==n) 
        {
            List<String> val=new ArrayList<>();
            for(int i=0;i<vis.length;i++)
            {
                StringBuilder temp=new StringBuilder();


                for(int j=0;j<vis.length;j++)
                {
                    if(vis[i][j]) temp.append('Q');
                    else 
                    temp.append('.');    
                }
                //System.out.println(val);
                val.add(temp.toString());
            }
            res.add(val);
            return ;
        }


        for(int i=0;i<n;i++)
        {
            vis[r][i]=true;
            if(check(vis,r,i))
            {
                func(r+1,n,vis);
                //System.out.println("come");
            }
            vis[r][i]=false;
        }

    }
    public List<List<String>> solveNQueens(int n) {

        boolean [][]vis=new boolean[n][n];

        func(0,n,vis);

        return res;
        
    }
}