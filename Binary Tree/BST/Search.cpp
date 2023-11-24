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
// class Solution {
// public:
//     TreeNode* searchBST(TreeNode* root, int val) {
//         if (root == NULL || root->val == val) {
//         return NULL; // If root is null or root contains the value, return NULL (no parent)
//     }
   
//     TreeNode* parent = NULL;
//     while (root != NULL) {
//         if (val < root->val) {
//             parent = root;
//             root = root->left;
//         } else if (val > root->val) {
//             parent = root;
//             root = root->right;
//         } else {
//             // Value found, return its parent node
//             return parent;
//         }
//     }
//     return NULL; // Value not found, return NULL
// }
    
// };

class Solution {
public:
    TreeNode* searchBST(TreeNode* root, int val) {
        if (root == NULL) return NULL;

        if(root->val == val) 
        return root; 
    
    
    if (val < root->val) return searchBST(root->left , val);
    else return searchBST(root->right , val);
            
   return root;     
}
    
};

