class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>merge;
        int s1=0,s2=0,n1=nums1.size(),n2=nums2.size();
        while(s1<n1 && s2<n2)
        {
            if(nums1[s1]<nums2[s2])
            {
                merge.push_back(nums1[s1]);
                s1++;
            }else if(nums1[s1]>nums2[s2])
            {
                merge.push_back(nums2[s2]);
                s2++;
            }
            else
            {
                merge.push_back(nums1[s1]);
                merge.push_back(nums1[s1]);
                s1++;
                s2++;
            }
        }

        while(s1<n1)
        {
            merge.push_back(nums1[s1++]);
        }
        while(s2<n2)
        {
            merge.push_back(nums2[s2++]);
        }
        int len=merge.size();
        cout<<len;
        
        if(len%2==0)
        {
            return double((merge[(len/2)]+merge[(len/2)-1]))/2;
        }else 
        {
            return (double)merge[(len/2)];
        }
    }
};