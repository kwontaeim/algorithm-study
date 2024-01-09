package cracking_the_coding_interview;


public class DeleteMiddleNode {

    /*
     * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
     * EXAMPLE
     * lnput:the node c from the linked list a->b->c->d->e->f
     * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
     */

    public static void main(String[] args) {
        ListNode inputList1 = new ListNode(5, new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(5))))));
        ListNode inputList2 = new ListNode(1, new ListNode(4, new ListNode(5)));
        deleteMiddleNode(kthNode(inputList1, 3));
        System.out.println("[Input 1] Remove 1 from '5->2->1->3->2->5' >>> expected 5->2->3->2->5, actual : " + print(inputList1));
        deleteMiddleNode(kthNode(inputList2, 2));
        System.out.println("[Input 2] Remove 5 from '1->4->5->' >>> expected 1->5, actual : " + print(inputList2));
    }

    static String deleteMiddleNode(ListNode mid) {
        if(mid == null && mid.next == null){
            return null;
        }
        ListNode next = mid.next;
        mid.val = next.val;
        mid.next = next.next;
        return print(mid);
    }

    static ListNode kthNode(ListNode head, int kth) {
        ListNode list = head;
        while(kth > 1) {
            list = list.next;
            kth--;
        }
        return list;
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
