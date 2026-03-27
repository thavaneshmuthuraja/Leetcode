class Solution {
    public int reverse(int x) {

        int rev=0;

        while(x!=0)
        {
            if(-(Math.pow(2,31))/10>rev || (Math.pow(2,31)-1)/10<rev) return 0;
            int ud=x%10;
            rev=rev*10+ud;
            x/=10;
        }

        return rev;
        
    }
}