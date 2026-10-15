class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder str=new StringBuilder();
        while(num>0)
        {
            if(sum==-1) {
                str.append(0);
            }
            else if(sum>9)
            {
                sum-=9;
                str.append('9');
            }else 
            {
                str.append((char)(sum+'0'));
                sum=-1;
            }
            num--;
        }
        if(sum!=-1) return "";
        return str.toString();
    }
}