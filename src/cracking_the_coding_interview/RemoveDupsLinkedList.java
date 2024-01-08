package cracking_the_coding_interview;

import java.util.HashSet;

public class RemoveDupsLinkedList {

    /*
     * P94
     * Remove Dups: Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP - How would you solve this problem if a temporary buffer is not allowed?
     */

    public static void main(String[] args) {
        ListNode inputList1 = new ListNode(5, new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(5))))));
        ListNode inputList2 = new ListNode(2, new ListNode(2, new ListNode(2)));
        System.out.println("[Input 1] '5->2->1->1->2->5' >>> expected 5->2->1->, actual : " + removeDupsNobuffer(inputList1));
        System.out.println("[Input 2] '2->2->2->' >>> expected 2->, actual : " + removeDupsNobuffer(inputList2));
        System.out.println("[Input 3] '5->2->1->1->2->5' >>> expected 5->2->1->, actual : " + removeDupsHash(inputList1));
        System.out.println("[Input 4] '2->2->2->' >>> expected 2->, actual : " + removeDupsHash(inputList2));
    }
    // solution 1 :  No Buffer Allowed
    static String removeDupsNobuffer(ListNode head) {
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

    // solution 2 : Use hash table
    static String removeDupsHash(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode list = head;
        while(list != null && list.next != null) {
            set.add(list.val);
            if(set.contains(list.next.val)){
                list.next = list.next.next;
            } else {
                list = list.next;
            }
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
