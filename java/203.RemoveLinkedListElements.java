// https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=2upe7rkj

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head node itself is to be removed
        while (head != null && head.val == val) {
            head = head.next; // Skip the head node if it contains the value
        }

        ListNode current = head;

        // Now, loop through the rest of the list
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Remove the node by skipping it
            } else {
                current = current.next; // Otherwise, just move to the next node
            }
        }

        return head; // Return the updated head of the list
    }
}
