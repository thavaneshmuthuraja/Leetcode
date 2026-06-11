class Solution {
public:
    bool validDigit(int n, int x) {
        bool ans =false;
        int rem=0;

        while(n)
        {
            rem=n%10;
            if(rem==x && n/10!=0) ans=true;
            if(rem==x && n/10==0) ans=false;
            n/=10; 
        }
        return ans;
    }
};