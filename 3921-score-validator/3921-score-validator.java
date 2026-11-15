class Solution {
    public int[] scoreValidator(String[] events) {
        int [] ans=new int [2];
        for(String val:events)
        {
            if(val.equals("W")) ans[1]++;
            else if(val.equals("WD") || val.equals("NB")) ans[0]++;
            else ans[0]+=(Integer.parseInt(val));
            if(ans[1]==10) break;
        }
        return ans;
    }
}