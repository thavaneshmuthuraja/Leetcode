class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];

        for(int i=0;i<m;i++)
        {
            String t="";
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==n-1)
                {
                    t+=".";
                }else
                {
                    t+="#";
                }
            }
            ans[i]=t;
        }
        return ans;
    }
}