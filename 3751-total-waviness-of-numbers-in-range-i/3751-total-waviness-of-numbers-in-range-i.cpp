class Solution {
public:
    int totalWaviness(int num1, int num2) {

        int c=0;

        for(int i=num1;i<=num2;i++)
        {
            string temp=to_string(i);
            int len=temp.size();
            for(int j=len-2;j>0;j--)
            {
                int bef=temp[j-1]-'0',af=temp[j+1]-'0',cur=temp[j]-'0';

                if((bef<cur && cur>af) || (bef>cur && cur<af))
                {
                    c++;
                }
            }
        }
        return c;
        
    }
};