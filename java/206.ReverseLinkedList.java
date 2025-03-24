// https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=2upe7rkj

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

//  My Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        // Edge Case
        if (head == null) {
            return head;
        }

        ListNode current = head;
        ArrayList<Integer> arr = new ArrayList();
        int i = 0;

        while (current != null) {
            arr.add(current.val);
            current = current.next;
        }

        Collections.reverse(arr);

        while (current2 != null) {
            current2.val = arr.get(i);
            current2 = current2.next;
            i++;
        }
        
        return head;
        
    }
}

// ChatGpt Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Store the next node
            curr.next = prev;              // Reverse the current node's pointer
            prev = curr;                   // Move prev to the current node
            curr = nextTemp;               // Move curr to the next node
        }
        
        return prev; // prev will be the new head of the reversed list
    }
}
