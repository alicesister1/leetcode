# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        return self.traverse(root)
    
    def traverse(self, node: TreeNode) -> List[List[int]]:
        if node is None:
            return node
        
        result = []
        q = [node]
        while q:
            temp = []
            next_q = []
            for node in q:
                temp.append(node.val)
                if node.left:
                    next_q.append(node.left)
                if node.right:
                    next_q.append(node.right)
            result.append(temp)
            q = next_q
            
        return result