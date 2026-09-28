class Solution {
    public String evaluate(String s, List<List<String>> k) {
      boolean ob=false;
      StringBuilder str=new StringBuilder(); 

      StringBuilder ans= new StringBuilder();

      Map<String,String> mp=new HashMap<>();
      for(List<String> arr:k)
      {
       
        mp.put(arr.get(0),arr.get(1));
      }

      for(int i=0;i<s.length();++i)
      {
        char cur=s.charAt(i);
        if(cur==')') {
            ob=false;
            
            if(mp.containsKey(str.toString()))
            {
                ans.append(mp.get(str.toString()));

            }else{
                ans.append('?');
            }
            str=new StringBuilder();
            continue;
        }
        if(ob)
        {
            str.append(cur);
            continue;
        }
        if(cur=='('){
            ob=true;
            continue;
        }

        ans.append(cur);
      } 

      return ans.toString();


    }

}