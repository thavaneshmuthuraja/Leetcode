class Solution {
public:

    int func(int n,vector<int>&costs,int i,vector<int>&mem)
    {
        if(i==n)
        {
            return 0;
        }

        if(i>n) return 1e9;

        if(mem[i]!=-1) return mem[i];

        int ans=1e9;
        if(i + 1 <= n) {

            ans=min(ans,costs[i]+1+func(n,costs,i+1,mem));
        }
        if(i + 2 <= n) {

            ans=min(ans,costs[i+1]+4+func(n,costs,i+2,mem));
        }
        if(i + 3 <= n) {

            ans=min(ans,costs[i+2]+9+func(n,costs,i+3,mem));
        }

        return mem[i]=ans;

    } 

    int climbStairs(int n, vector<int>& costs) {

        vector<int> mem(n+1,-1);

        mem[0]=0;

        for(int i=1;i<=n;i++)
        {
            int ans=1e9;
        if(i-1>=0) {

            ans=min(ans,costs[i-1]+1+mem[i-1]);
        }
        if(i-2>=0) {

            ans=min(ans,costs[i-1]+4+mem[i-2]);
        }
        if(i-3>=0) {

            ans=min(ans,costs[i-1]+9+mem[i-3]);
        }
        mem[i]=ans;
        }
        return mem[n];
    }
};