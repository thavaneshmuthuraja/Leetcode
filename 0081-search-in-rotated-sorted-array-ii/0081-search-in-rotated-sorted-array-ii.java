class Solution {
    public boolean search(int[] nums, int target) {
        int h=nums.length-1,l=0;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if(nums[l] == nums[mid] && nums[mid] == nums[h])
                {
                    if(nums[mid]==target) return true;
                    l++;
                    h--;

                }
                
            else if(nums[mid]==target)
            {
                return true;
            }else if(nums[mid]<=nums[h])
            {
                if(nums[mid]<=target && target<=nums[h])
                {
                    l=mid+1;
                }else
                {
                    h=mid-1;
                }
            }else
            {
                if(nums[l]<=target && target<=nums[mid])
                {
                    h=mid-1;
                }else
                {
                    l=mid+1;
                }

            }
        }

        return false;
    }
}