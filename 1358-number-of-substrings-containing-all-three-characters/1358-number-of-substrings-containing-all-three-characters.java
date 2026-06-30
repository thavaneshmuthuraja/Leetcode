class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int []arr=new int [256];
        int st=0,end=0,cnt=0;
        while(end<n)
        {
            char ch=s.charAt(end);
            arr[ch]++;
            while(st<end && arr['a']>=1 && arr['b']>=1 && arr['c']>=1)
            {
                char t=s.charAt(st);
                arr[t]--;
                cnt+=(n-end);
                st++;
            }
            end++;
        }

        return cnt;
    }
}