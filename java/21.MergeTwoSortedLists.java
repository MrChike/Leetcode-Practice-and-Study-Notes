// https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=2upe7rkj

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

//  https://www.notion.so/Leetcode-1b9783cd66cd80e9a7dbf125ee5cfcc1?pvs=4#1b9783cd66cd80d4b34cdfa5faf05ef6

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);  // Dummy node to simplify merging
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;   // Attach list1's node to the merged list
                list1 = list1.next;    // Move forward in list1
            } else {
                current.next = list2;   // Attach list2's node
                list2 = list2.next;    // Move forward in list2
            }
            current = current.next;  // Move current to the last node in merged list
        }

        if (list1 != null) {
            current.next = list1;  // Attach remaining nodes from list1
        } else {
            current.next = list2;  // Attach remaining nodes from list2
        }

        return dummy.next;  // The merged list starts from dummy.next (ignoring dummy)
    }
}
