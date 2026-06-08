class Solution {
public:

    int func(int n,int sum,vector<int>&mem)
    {

        if(n==sum)
        {
            return 1;
        }

        if(n<sum) return 0;

        if(mem[sum]!=-1) return mem[sum];

        int st_1=func(n,sum+1,mem)+func(n,sum+2,mem);

        return mem[sum]=st_1;
    }

    int climbStairs(int n) {
        vector<int>mem(n+2,-1);
        return func(n,0,mem);
    }
};