class Solution {

    StringBuilder rev(StringBuilder str,int l,int r)
    {
        while(l<r)
        {
            char t=str.charAt(l);
            str.setCharAt(l,str.charAt(r));
            str.setCharAt(r,t);
            l++;
            r--;
        }

        return str;
    }
    
    public String processStr(String s) {

        StringBuilder str=new StringBuilder("");

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='#')
            {
                str.append(str);
            }else if(ch=='%')
            {
                if(str.length()>0) str=rev(str,0,str.length()-1);
            }else if(ch=='*')
            {
                if(str.length()>0) str.deleteCharAt(str.length()-1);
            }else
            {
                str.append(ch);
            }
        }
        return str.toString();
    }
}