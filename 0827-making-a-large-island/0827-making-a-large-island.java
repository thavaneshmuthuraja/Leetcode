class DSU {
    int []par;
    public int []size;
    DSU(int n)
    {
        par=new int[n];
        size=new int [n];
        for(int i=0;i<n;i++){
            par[i]=i;
        }
        Arrays.fill(size,1);
    }

    int find(int repx)
    {
        if(repx==par[repx])
        {
            return repx;
        }

        return par[repx]=find(par[repx]);
    }

    void unite(int x,int y)
    {
        int repx=find(x);
        int repy=find(y);
        if(repx==repy) return;
        par[repy]=repx;
        size[repx]+=size[repy];
    }
}

class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        boolean isZero=false;
        DSU obj=new DSU(n*n);

        int [][]dir={{0,1},{1,0},{-1,0},{0,-1}};

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=0)
                {
                    int curNode=(i*n)+j;
                    for(int k=0;k<4;k++)
                    {
                        int nr=i+dir[k][0];
                        int nc=j+dir[k][1];
                        if(nr<n && nc<n && nr>=0 && nc>=0  && grid[nr][nc]!=0)
                        {
                            int newNode=(nr*n)+nc;
                            obj.unite(curNode,newNode);
                        }
                    }

                }else
                 isZero=true;
            }
        }

        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    Set<Integer>s =new HashSet<>();
                    for(int k=0;k<4;k++)
                    {
                        int nr=i+dir[k][0];
                        int nc=j+dir[k][1];
                        if(nr<n && nc<n && nr>=0 && nc>=0 && grid[nr][nc]!=0)
                        {
                            s.add(obj.find(((nr*n)+nc)));
                        }
                    }
                    int t=0;

                    for(int v:s)
                    {
                        t+=obj.size[v];
                    }
                    ans=Math.max(ans,t+1);

                }
            }
        }
        if(isZero) return ans;
        return n*n;
    }
}