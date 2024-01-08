package cracking_the_coding_interview;

public class RemoveDupsLinkedList {

    /*
     * P94
     * Remove Dups: Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP - How would you solve this problem if a temporary buffer is not allowed?
     */

    public static void main(String[] args) {
        ListNode inputList1 = new ListNode(5, new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(5))))));
        ListNode inputList2 = new ListNode(2, new ListNode(2, new ListNode(2)));
        System.out.println("[Input 1] '5->2->1->1->2->5' >>> expected 5->2->1->, actual : " + removeDups(inputList1));
        System.out.println("[Input 2] '2->2->2->' >>> expected 2->, actual : " + removeDups(inputList2));
    }

    static String removeDups(ListNode head) {
        ListNode list = head;
        ListNode base = head;
        while (base != null) {
            while (list != null && list.next != null) {
                if(base.val == list.next.val) {
                    list.next = list.next.next;
                } else {
                    list = list.next;
                }
            }
            base = base.next;
            list = base;
        }
        return print(head);
    }

    // Definition of singly linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static String print(ListNode node) {
        ListNode list = node;
        String out = "";
        System.out.print("Node : ");
        while (list != null) {
            out = out + list.val + "->";
            list = list.next;
        }
        return out;
    }
}
