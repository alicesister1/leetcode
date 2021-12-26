# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.longest = 0
        self.maxDepth(root)
        return self.longest
    
    
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root: 
            return 0
        left = self.maxDepth(root.left)
        right = self.maxDepth(root.right)
        self.longest = max(self.longest, left + right)
        return max(left, right) + 1
        