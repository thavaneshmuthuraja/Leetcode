class Solution {
    public int countPrimes(int n) {

        boolean []vis=new boolean[n+1];

        for(int i=2;i*i<n;i++)
        {
            if(!vis[i])
            {
                for(int j=i+i;j<n;j+=i)
                {
                    //System.out.println(j);
                    vis[j]=true;
                }
            }
        }

        int cnt=0;

        for(int i=2;i<n;i++)
        {
            if(!vis[i]) cnt++;
        }
        return cnt;
    }
}