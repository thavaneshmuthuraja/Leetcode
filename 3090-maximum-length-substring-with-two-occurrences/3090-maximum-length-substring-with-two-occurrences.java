class Solution {
    public int maximumLengthSubstring(String s) {
        int st=0,end=0,n=s.length(),mfreq=0,ans=0;
        Map<Character,Integer> mp=new HashMap<>();
        while(end<n)
        {
            char c=s.charAt(end);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.getOrDefault(c,0)>2 && st<n)
            {
                char t=s.charAt(st);
                 mp.put(t,mp.getOrDefault(t,0)-1);
                st++;
            }
            ans=Math.max(ans,end-st+1);
            end++;
        }

        return ans;
    }
}