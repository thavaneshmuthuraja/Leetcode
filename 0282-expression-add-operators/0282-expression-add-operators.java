class Solution {
    List<String> ans=new ArrayList<>();
    void func(int ind,long sum,String num,long tar,long prev,String temp)
    {
        if(num.length()==ind)
        {
            if(sum==tar)
            {
                ans.add(temp);
            }
            return ;
        }

        for(int j=ind;j<num.length();j++)
        {
            String t=num.substring(ind,j+1);
            long number=Long.parseLong(t);
            if(j>ind && num.charAt(ind)=='0') break ;
            if(ind==0)
            {
                func(j+1,number,num,tar,number,temp+t);
            }else
            {
                func(j+1,sum+number,num,tar,number,temp+"+"+t);
                func(j+1,sum-number,num,tar,-number,temp+"-"+t);
                func(j+1,sum-prev+(prev*number),num,tar,prev*number,temp+"*"+t);
            }
        }

    }
    public List<String> addOperators(String num, int target) {
        func(0,0,num,(long)target,0,"");
        return ans;
    }
}