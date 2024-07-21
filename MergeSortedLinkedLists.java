// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLinkedLists {
    
    // Function to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to hold the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Traverse both lists and merge nodes in sorted order
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        // If any list has remaining nodes, append them
        if (l1 != null) {
            current.next = l1;
        }
        
        if (l2 != null) {
            current.next = l2;
        }
        
        // Return the merged list starting from the next of dummy node
        return dummy.next;
    }
    
    // Utility function to print a linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(12);
        
        ListNode l2 = new ListNode(15);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(19);
        
        // Create an instance of MergeSortedLinkedLists
        MergeSortedLinkedLists merger = new MergeSortedLinkedLists();
        
        // Merge the two lists
        ListNode mergedList = merger.mergeTwoLists(l1, l2);
        
        // Print the merged list
        System.out.print("Merged List: ");
        merger.printList(mergedList);
    }
}
