package cracking_the_coding_interview;


public class ReturnKthToLast {

    /*
     * P223
     * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
     */

    public static void main(String[] args) {
        ListNode inputList1 = new ListNode(5, new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(5))))));
        ListNode inputList2 = new ListNode(2, new ListNode(2, new ListNode(2)));
        System.out.println("[Input 1] the 2nd to last element of '5->2->1->1->2->5' >>> expected 2, actual : " + kthToLast(inputList1, 2));
        System.out.println("[Input 2] the 2nd to last element of '2->2->2->' >>> expected 0, actual : " + kthToLast(inputList2, 4));
        System.out.println("[Input 3] the 1st to last element of '5->2->1->1->2->5' >>> expected 5 , actual : " + kthToLast(inputList1, 1));
        System.out.println("[Input 4] the 3rd to last element of '2->2->2->' >>> expected 2, actual : " + kthToLast(inputList2, 3));
    }

    static int kthToLast(ListNode head, int kth) {
        ListNode list = head;
        int count = 1;
        ListNode node = head;
        while(list.next != null) {
            if(count >= kth) {
                node = node.next;
            }
            list = list.next;
            count++;
        }
        if(count < kth) {
            return 0;
        }
        return node.val;
    }

    // Definition of singly linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
