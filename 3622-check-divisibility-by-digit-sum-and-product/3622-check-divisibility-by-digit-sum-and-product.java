class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1,t=n;
        while(t!=0)
        {
            int v=t%10;
            t=t/10;
            sum+=(v);
            pro*=(v);
        }

        if(n%(sum+pro)==0) return true;
        return false;


    }
}