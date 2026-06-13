class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        String ans="";

        for(String str: words)
        {
            int sum=0;
            for(char ch:str.toCharArray())
            {
                 sum+=weights[ch-'a'];
            }
            sum=sum%26;
            ans+=String.valueOf((char)(25-sum+'a'));
        }

        return ans;
    }
}