class Solution {
    double func(double x,long n)
    {
        if(n==0) return 1;
        if(n%2==0)
        {
            double v=func(x,n/2);
            return v*v;
        }else
        {
            double v=func(x,(n-1)/2);

            return x*v*v ;
        }
    }
    public double myPow(double x, int n) {
        long num=Math.abs((long)n);
        double ans=func(x,num);

        if(n>=0) return ans;

        return (double)1/ans;
    }
}