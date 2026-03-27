class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,left=0,right=n-1,bot=n-1,val=1;

        int [][]res=new int[n][n];

        while(left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                res[top][i]=val++;
            }
            top++;

            for(int i=top;i<=bot;i++)
            {
                res[i][right]=val++;
            }

            right--;

            for(int i=right;i>=left;i--)
            {
                res[bot][i]=val++;
            }
            bot--;

            for(int i=bot;i>=top;i--)
            {
                res[i][left]=val++;
            }

            left++;
        }
        
        return res;
    }
}