class Solution {
    public int candy(int[] ratings) {
        
        int sum=0,n=ratings.length,cur_rat=1;
        int rat[]=new int [n];
        Arrays.fill(rat,1);
        if(n==1) return 1;

        for(int i=1;i<n;++i)
        {
            if(ratings[i-1]<ratings[i])
            {
                rat[i]=rat[i-1]+1;
            }
        }
        //right to left 
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
               if(rat[i]<=rat[i+1])
               {
                rat[i]=rat[i+1]+1;
               } 
            }
        }
        for(int i=0;i<n;i++) sum+=rat[i];
        return sum;
    }
}