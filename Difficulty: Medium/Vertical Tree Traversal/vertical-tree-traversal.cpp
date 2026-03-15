/*
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};
*/

class Solution {
  public:
    vector<vector<int>> verticalOrder(Node *root) {
        // code here
        queue<pair<Node*,int>> q;
        vector<vector<int>>res;
        map<int,vector<int>>m;
        q.push({root,0});
        
        while(!q.empty()){
            auto curr=q.front();
            q.pop();
            Node *node=curr.first;
            int dis=curr.second;
            
            m[dis].push_back(node->data);
            
            if(node->left!=nullptr){
                q.push({node->left,dis-1});
            }
            
            if(node->right!=nullptr){
                q.push({node->right,dis+1});
            }
        }
        
        for(auto ele:m){
            res.push_back(ele.second);
        }
        return res;
    }
};