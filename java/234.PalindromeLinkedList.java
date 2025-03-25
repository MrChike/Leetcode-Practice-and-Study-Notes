// https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=2upe7rkj

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

//  LeetCode Solution
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode fast = head, slow = head;
        
//         while (fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//         }
        
//         fast = reverse(slow);
        
//         while (fast != null) {
//             if (head.val != fast.val) return false;
//             head = head.next;
//             fast = fast.next;
//         }

//         return true;
        
//     }
    
//     public ListNode reverse (ListNode slow) {   
//         ListNode prev = null;

//         while (slow != null) {
//             ListNode tmp = slow.next;
//             slow.next = prev;
//             prev = slow;
//             slow = tmp;
//         }

//         return prev;
//     }
// }

// DeepSeek Solution

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        
        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
}
