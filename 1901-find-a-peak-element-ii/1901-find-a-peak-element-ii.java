class Solution {
    int func(int[][] nums,int row) {
        int m=nums.length,n=nums[0].length;
        int l = 0, h = nums[row].length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            int p = mid - 1 >= 0 ? nums[row][mid - 1] : Integer.MIN_VALUE;
            int f = mid + 1 < n ? nums[row][mid + 1] : Integer.MIN_VALUE;
            int t = row - 1 >= 0 ? nums[row-1][mid] : Integer.MIN_VALUE;
            int b = row + 1 < m ? nums[row+1][mid] : Integer.MIN_VALUE;

            if (p < nums[row][mid] && nums[row][mid] > f && nums[row][mid]>t && nums[row][mid]>b) {
                return mid;
            } else if (p > nums[row][mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;

    }

    public int[] findPeakGrid(int[][] mat) {

        int [] ans=new int [2];

        for(int i=0;i<mat.length;i++)
        {
            int j=func(mat,i);
            if(j!=-1) 
            {
                ans[0]=i;
                ans[1]=j;
            }
        }

        return ans;

    }
}