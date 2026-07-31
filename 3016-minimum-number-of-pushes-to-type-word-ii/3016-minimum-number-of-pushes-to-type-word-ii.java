class Solution {
    public int minimumPushes(String word) {
        
        Integer [] freq=new Integer [26];
        Arrays.fill(freq, 0);
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq,Collections.reverseOrder());
        int []val=new int [26];
        Arrays.fill(val,-1);
        int cnt=1;
        int ans=0;
        for(int j=0;j<26;j++)
        {
            if(freq[j]!=0)
            {
                ans+=freq[j]*cnt;
            }
            if((j+1)>=8 && (j+1)%8 ==0) cnt++;
        }

        return ans;

    }
}