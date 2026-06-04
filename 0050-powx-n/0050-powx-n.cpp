class Solution {
public:
    double myPow(double x, int pow) {

        long long n= pow;

        bool neg=false;
        if(n<0){

            neg=true;
            n=n*-1;
        }

        double a=x,ans=1;
        while(n>0)
        {
            if(n&1==1)
            {
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }

        if(neg)
        {
            return 1/ans;
        }else
        {
            return ans;
        }

    }
};