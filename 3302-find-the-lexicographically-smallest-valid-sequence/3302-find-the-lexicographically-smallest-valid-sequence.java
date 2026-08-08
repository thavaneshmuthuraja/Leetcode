class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int [] last=new int[m];
        Arrays.fill(last,-1);

        for(int i=n-1,j=m-1;i>=0 && j>=0;i--)
        {
            if(word1.charAt(i)==word2.charAt(j))
            {
                last[j]=i;
                j--;
            }
        }
        boolean modifie=true;
        int [] ans=new int [m];
        int j=0;
    for(int i=0;i<n && j<m;i++)
    {
        if(word1.charAt(i)==word2.charAt(j))
        {
            ans[j]=i;
            j++;
        }else if(word1.charAt(i)!=word2.charAt(j) && (modifie && (j==m-1 || i<last[j+1])))
        {
            ans[j]=i;
            j++;
            modifie=false;
        }
    }
    if(j<m) return new int [0];

    return ans;
        
    }
}