class Solution {
    public int[] findEvenNumbers(int[] digits) {

        Set<Integer>arr=new TreeSet<>();
        int in=0;
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i]==0) continue;

            for(int j=0;j<digits.length;j++)
            {
                if(i==j) continue;
                for(int k=0;k<digits.length;k++)
                {
                    if(i==k||k==j) continue;
                    if((digits[k]&1)==1) continue;
                    int v=((digits[i]*10+digits[j])*10)+digits[k];

                    arr.add(v);
                }
            }
        }
        int []ans=new int[arr.size()];
        int i = 0;

        for (int x : arr) {
            ans[i++] = x;
        }
        return ans;
    }
}