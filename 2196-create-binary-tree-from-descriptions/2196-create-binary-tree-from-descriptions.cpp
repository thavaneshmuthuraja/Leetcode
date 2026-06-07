/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* createBinaryTree(vector<vector<int>>& descriptions) {

        unordered_map<int,pair<TreeNode*,TreeNode*>>mp;

        for(auto node: descriptions)
        {
            TreeNode* cur=NULL;
            TreeNode *pnode=NULL;
            int child=node[1],par=node[0],lc=node[2];

            if(mp.find(child)!=mp.end())
            {
                cur=mp[child].first;
            }else
            {
                cur=new TreeNode(child);
                mp[child]={cur,NULL};
            }

         
            if(mp.find(par)!=mp.end())
            {
                pnode=mp[par].first;
            }else
            {
                pnode=new TreeNode (par);
                mp[par]={pnode,NULL};
            }

            if(lc)
            {
                pnode->left=cur;
            }else
            {
                pnode->right=cur;
            }
            mp[child]={cur,pnode};
            
        }
        
        for(auto k:mp)
        {
            if(k.second.second==NULL)
            {
                return k.second.first;
            }
        }
        return NULL;
    }
};