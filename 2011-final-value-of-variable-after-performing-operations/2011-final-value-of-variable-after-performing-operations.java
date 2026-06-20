class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x=0;
        for(int i=0;i<operations.length;i++)
        {
        char f=operations[i].charAt(0);
        char s=operations[i].charAt(1);
        char t=operations[i].charAt(2);

        if(f=='-' ||s=='-')
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