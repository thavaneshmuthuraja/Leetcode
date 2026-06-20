class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x=0;
        for(int i=0;i<operations.length;i++)
        {
        char s=operations[i].charAt(1);

        if(s=='-')
        {
            x--;
        }else
        {
            x++;
        }

        }
        return x;


    }
}