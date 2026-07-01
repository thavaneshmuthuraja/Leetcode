class Solution {
    boolean func(int []mat,int t)
    {
        int h=mat.length-1,l=0;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if(t==mat[mid])
            {
                return true;
            }else if (t>mat[mid])
            {
                l=mid+1;
            }else {
                h=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int t) {
        int n=mat[0].length,m=mat.length;

        for(int i=0;i<mat.length;i++)
        {
            if(func(mat[i],t)) return true;
        }

        return false;
    }
}