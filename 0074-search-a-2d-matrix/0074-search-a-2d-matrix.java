class Solution {
    int getRow(int [][]mat,int col,int t)
    {
        int l=0,h=mat.length-1,ans=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(mat[mid][col]>=t)
            {
                ans=mid;
                h=mid-1;
            }else
            {
                l=mid+1;
            }
        }

        return ans;

    }

    public boolean searchMatrix(int[][] mat, int t) {
        int n=mat[0].length,l=0,h=n-1;
        int row=getRow(mat,n-1,t);
        if(row==-1) return false;

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(mat[row][mid]==t) return true;
            else if(mat[row][mid]>t) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}