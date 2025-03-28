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

// My initial Code (ft chatGPT)
 class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ArrayList<ListNode> middleNode = new ArrayList<>();
        
        while (current != null) {
            middleNode.add(current);
            current = current.next;
        }

        int middleIndex = middleNode.size() / 2;
        return middleNode.get(middleIndex);
    }
}


//  My initial Code
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode current1 = head;
//         ArrayList<Integer> middleSelection = new ArrayList<>();
//         int middleNode = 0;

//         while (current1 != null) {
//             middleSelection.add(current1.val);
//             current1 = current1.next;
//         }

//         middleNode = middleSelection.get(middleSelection.size()/2);
//         ListNode current2 = head;

//         while (current2 != null) {
//             System.out.println(current2.val);
//             if (current2.val == middleNode) {
//                 return current2;
//             }
//             current2 = current2.next;
//         }

//         return current2;
//     }
// }

