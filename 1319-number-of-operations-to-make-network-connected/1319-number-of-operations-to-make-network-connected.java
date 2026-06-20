class Solution {

    public int find(int []par,int rep)
    {
        if(rep==par[rep])
        {
            return rep;
        }
        return par[rep]=find(par,par[rep]);
    }

    public void unite(int []rank,int[]par,int x,int y)
    {
        int repx=find(par,x);
        int repy=find(par,y);

        if(rank[repx]>rank[repy])
        {
            par[repy]=repx;

        }else if(rank[repx]<rank[repy])
        {
            par[repx]=repy;

        }else
        {
            rank[repx]++;
            par[repy]=repx;
        }

    }
    public int makeConnected(int n, int[][] connections) {

        
        if(connections.length<n-1)
        {
            return -1;
        }

        int []par=new int[n];
        int []rank=new int[n];
        Arrays.fill(rank,0);

        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }

        for(int []c:connections)
        {
            if(find(par,c[0])!=find(par,c[1]))
            {
                unite(rank,par,c[0],c[1]);
            }
        }
        int ncon=0;

        for(int i=0;i<n;i++)
        {
            if(par[i]==i)
            {
                ncon++;
            }
        }

        return   ncon-1;
        
    }
}