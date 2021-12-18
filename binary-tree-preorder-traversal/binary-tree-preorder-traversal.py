# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        # root -> left -> right
        
        result = list[int]()
        self.traverse(root, result)
        return result
    
    def traverse(self, node: TreeNode, result: List[int]) -> None:
        if node:
            result.append(node.val)
            if node.left:
                self.traverse(node.left, result)
            if node.right:
                self.traverse(node.right, result)

        