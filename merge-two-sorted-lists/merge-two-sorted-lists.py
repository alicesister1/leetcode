# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if list1 is None and list2 is None:
            return None
        
        result = ListNode(0)
        head = result
        while list1 and list2:
            print(f'list1:{list1.val}, list2: {list2.val}')
            if list2.val <= list1.val:
                head.next = ListNode(list2.val)
                list2 = list2.next
            else:
                head.next = ListNode(list1.val)
                list1 = list1.next
            head = head.next
        
        if list1:
            head.next = list1
        if list2:
            head.next = list2
            
        
        print(result.next)
        return result.next
    
    def prints(self, list0: Optional[ListNode]):
        while list0.next:
            print(list0.val)
            list0 = list0.next
        