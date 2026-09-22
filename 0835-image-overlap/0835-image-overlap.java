class Solution {
    class Pair
    {
        int r,c;
        Pair(int i,int j)
        {
            r=i;
            c=j;
        }
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<Pair> l1=new ArrayList<>();
        List<Pair> l2=new ArrayList<>();

        for(int i=0;i<img1.length;++i)
        {
            for(int j=0;j<img1[i].length;++j)
            {
                if(img1[i][j]==1) 
                {
                    l1.add(new Pair(i,j));
                }
                if(img2[i][j]==1) 
                {
                    l2.add(new Pair(i,j));
                }
            }
        }
        int n=img1.length;

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<l1.size();i++)
        {
            Pair p1=l1.get(i);
            for(int j=0;j<l2.size();++j)
            {
                Pair p2=l2.get(j);
                int r1=p1.r;
                int c1=p1.c;
                int r2=p2.r;
                int c2=p2.c;
                int vec=(r2-r1+30)*100+(c2-c1+30);
                mp.put(vec,mp.getOrDefault(vec,0)+1);
            }
        }
        int ans=0;
        for(int v:mp.values())
        {
            ans=Math.max(ans,v);
        }
        return ans;

    }
}