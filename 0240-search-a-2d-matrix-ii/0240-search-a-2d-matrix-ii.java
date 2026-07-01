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
        int row=0,col=mat[0].length-1;

        while(row<mat.length && row>=0 && col<mat[0].length && col>=0)
        {
            if(mat[row][col]<t)
            {
                row++;
            }else if(mat[row][col]>t)
            {
                col--;
            }else 
            {
                return true;
            }
        }

        return false;
    }
}