class Solution {
    public String smallestPalindrome(String s) {
        int []freq=new int [256];
        Arrays.fill(freq,0);
        int mid=-1;
        StringBuilder suf=new StringBuilder(),pre=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            freq[c]++;
        }

        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
            {
                int rem=freq[i]%2;
                int val=freq[i]/2;
                for(int j=0;j<val;j++)
                {
                    suf.append(String.valueOf((char)i));
                    pre.append(String.valueOf((char)i));
                }
                if(rem==1)
                {
                    mid=i;
                }
            }
        }

        if(mid!=-1)
        {
            suf.append(String.valueOf((char)mid));
        }
        suf.append(pre.reverse());

        return suf.toString();
        
    }
}