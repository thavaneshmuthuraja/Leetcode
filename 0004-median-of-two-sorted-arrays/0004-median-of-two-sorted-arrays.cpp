class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        int s1=0,s2=0,n1=nums1.size(),n2=nums2.size();
        int len=n1+n2,in=0,c_in=0,ans=0;

        c_in=len/2;
        cout<<c_in;

        int in_val=-1;

        while(s1<n1 && s2<n2)
        {

            if(nums1[s1]<nums2[s2])
            {
                in_val=nums1[s1++];
            }else if(nums1[s1]>nums2[s2])
            {
                in_val=nums2[s2++];
            }
            else
            {
                in_val=nums1[s1];
                s1++;
            }
            if(len%2==0 && (in==c_in || in==c_in-1) )
            {
                ans+=in_val;
            }
            if(len%2==1 && c_in==in)
            {
                return (double)in_val;
            }
            in++;
        }

        while(s1<n1)
        {
            in_val=nums1[s1++];

            if(len%2==0 && (in==c_in || in==c_in-1) )
            {
                ans+=in_val;
            }
            if(len%2==1 && c_in==in)
            {
                return (double)in_val;
            }
            in++;
            
        }
        while(s2<n2)
        {
            in_val=nums2[s2++];
            if(len%2==0 && (in==c_in || in==c_in-1) )
            {
                ans+=in_val;
            }
            if(len%2==1 && c_in==in)
            {
                return (double)in_val;
            }
            in++;
        }

        return (double)ans/2;
    }
};