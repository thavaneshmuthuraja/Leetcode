class Solution {
    public int minLights(int[] lights) {
        int []dif=new int[lights.length+9];

        for(int i=0;i<lights.length;i++)
        {
            if(lights[i]>0)
            {
                int st=Math.max(0,i-lights[i]);
                int end=Math.min(lights.length-1,i+lights[i]);
                dif[st]+=lights[i];
                dif[end+1]-=lights[i];
            }
        }

        int []pre=new int [lights.length];
        int s=0;
        for(int i=0;i<lights.length;i++)
        {
            s+=dif[i];
            pre[i]=s;
        }
        
        int cnt=0;
        int n=pre.length;
        for(int i=0;i<pre.length;i++)
        {
            if(pre[i]!=0) continue;
            if(pre[i]==0 && pre[Math.min(i+1,n-1)]==0)
            {
                cnt++;
                i+=2;
            }else if(pre[i]==0)
            {
                cnt++;
                i++;
            }
        }
        return cnt;
    }
}