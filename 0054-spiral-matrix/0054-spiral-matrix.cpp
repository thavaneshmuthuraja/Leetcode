class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        vector<int> ans;
        
        int t = 0;
        int b = matrix.size() - 1;
        int l = 0;
        int r = matrix[0].size() - 1;
        
        while(t <= b && l <= r)
        {
            // 1. left to right at top row
            for(int i = l; i <= r; i++)
            {
                ans.push_back(matrix[t][i]);
            }
            t++;
            
            // 2. top to bottom at right column
            for(int i = t; i <= b; i++)
            {
                ans.push_back(matrix[i][r]);
            }
            r--;
            
            // 3. right to left at bottom row
            if(t <= b)
            {
                for(int i = r; i >= l; i--)
                {
                    ans.push_back(matrix[b][i]);
                }
                b--;
            }
            
            // 4. bottom to top at left column
            if(l <= r)
            {
                for(int i = b; i >= t; i--)
                {
                    ans.push_back(matrix[i][l]);
                }
                l++;
            }
        }
        
        return ans;
    }
};