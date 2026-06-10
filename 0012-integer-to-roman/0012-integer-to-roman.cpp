class Solution {
public:
    string intToRoman(int num) {
        
        unordered_map<int,string>mp;
        mp[1]="I";
        mp[5]="V";
        mp[10]="X";
        mp[50]="L";
        mp[100]="C";
        mp[500]="D";
        mp[1000]="M";

        int _10_p=0,cnt=0;
        string ans="";
        while(num)
        {
            string t="";
            _10_p=pow(10,cnt);

            int rem=num%10;

            if(rem==4)
            {
                t=mp[_10_p]+mp[_10_p*5];
            }
            else if(9==rem)
            {
                t=mp[_10_p]+mp[_10_p*10];   
            }
            else if(rem>=5)
            {
                rem=rem*_10_p;
                int v=5*_10_p;
                rem-=v;
                t=mp[v];
                for(int i=_10_p;i<=rem;i+=_10_p)
                {
                    t=t+mp[_10_p];
                }
            }else 
            {
                rem=rem*_10_p;
                for(int i=_10_p;i<=rem;i+=_10_p)
                {
                    t=t+mp[_10_p];
                }
            }
            ans=t+ans;
            num/=10;
            cout<<num<<"\n";
            cnt++;
        }
        return ans;
    }
};