# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None or head.next is None:
            return True
        
        # count
        count = 0
        current = head
        while current:
            current = current.next
            count = count + 1
        
        # reverse 
        mid = int(count / 2)
        prev = None
        next = None
        i = 0
        while i < mid and head:
            next = head.next
            head.next = prev
            prev = head
            head = next
            i = i + 1;
        
        if count % 2 == 1:
            next = next.next
        
        # compare
        while prev != None and next != None:
            if prev.val != next.val:
                return False
            prev = prev.next
            next = next.next
            
        return True
        
    def prints(self, node: Optional[ListNode]):
        while node:
            print(node.val)
            node = node.next