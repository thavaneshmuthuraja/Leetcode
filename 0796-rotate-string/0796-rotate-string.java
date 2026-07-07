class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()) return false;

        String check=s+s;
        int in1=0,in2=0;
        while(in1<check.length())
        {
            while( in2<g.length() &&  in1<check.length() && check.charAt(in1)==g.charAt(in2))
            {
                in1++;
                in2++;
            }
            if(in2==0) in1++; 
            if(g.length()==in2) return true;
            in2=0;
        }

        return false;
    }
}