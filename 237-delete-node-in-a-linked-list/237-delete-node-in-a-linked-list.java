/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while (node != null) {
            if (node.next == null) { 
                break;
            }
            ListNode next = node.next;
            node.val = next.val;
            if (next.next == null) {
                node.next = null;
            }
            node = next;
        }
    }
}