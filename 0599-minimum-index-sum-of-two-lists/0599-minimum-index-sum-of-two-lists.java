class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        String[] ans=new String[list1.length+list2.length];
        int min=(int)1e9,in=0;
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]) && min>(i+j))
                {
                    Arrays.fill(ans,"");
                    min=i+j;
                    in=0;
                    ans[in++]=list1[i];
                }else if((i+j)==min && list1[i].equals(list2[j]))
                {
                    ans[in++]=list1[i];
                }
            }
        }
        String[] ans1=new String[in];

        for(int i=0;i<in;i++)
        {
            ans1[i]=ans[i];
        }
        
       
        return ans1;
        
    }
}