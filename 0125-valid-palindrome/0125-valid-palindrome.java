class Solution {
    public boolean isPalindrome(String s) {

        int l=0,r=s.length()-1;

        s=s.toLowerCase();

        while(l<r)
        {
            Character first_one=s.charAt(l);
            Character second_one=s.charAt(r);

            if(Character.isLetterOrDigit(first_one) && Character.isLetterOrDigit(second_one) && Objects.equals(first_one,second_one))
            {
                l++;
                r--;
            }else if(!Character.isLetterOrDigit(first_one))
            {
                l++;
            }else if(!Character.isLetterOrDigit(second_one))
            {
                r--;
            }
            else
                {
                    return false;
                }
        }
        return true;
    }
}