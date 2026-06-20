class Solution {

    public void dfs(int node,boolean []vis,ArrayList<ArrayList<Integer>>adj)
    {
        vis[node]=true;
        for(int n:adj.get(node))
        {
            if(!vis[n])
            {
                dfs(n,vis,adj);
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        
        int cables=connections.length,nCon=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean []vis=new boolean[n];

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int []val:connections)
        {
            int u=val[0];
            int v=val[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        if(n-1>cables)
        {
            return -1;
        }else
        {
            for(int i=0;i<n;i++)
            {

                if(!vis[i]){
                nCon++;
                dfs(i,vis,adj);
                }
            }
        }
        return nCon-1;
    }
}