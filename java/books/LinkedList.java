// Definition for a singly-linked list node
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    ListNode head;

    // Function to delete a node at a given position
    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode temp = head;

        // Case 1: Delete the head node
        if (position == 1) {
            head = temp.next;
            return;
        }

        // Traverse to the node before the one to be deleted
        ListNode prev = null;
        int count = 1;

        while (temp != null && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        // If position is greater than the length of the list
        if (temp == null) {
            System.out.println("Position does not exist.");
            return;
        }

        // Unlink the node from the list
        prev.next = temp.next;
    }

    // Function to print the linked list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Function to add a node at the end of the list
    public void append(int newData) {
        ListNode newNode = new ListNode(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Driver function to test the deleteNode function
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating the linked list: 1 -> 2 -> 3 -> 4
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.print("Original List: ");
        list.printList();

        // Deleting node at position 2
        list.deleteNode(2);

        System.out.print("After Deleting Position 2: ");
        list.printList();
    }
}
