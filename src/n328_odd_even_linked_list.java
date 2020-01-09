public class n328_odd_even_linked_list {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = oddEvenList(head);

        ListNode print = head;
        while (print != null){
            System.out.print(print.toString());
            System.out.print("->");
            print = print.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        ListNode odd = head, even = head.next, evenHead = even;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
}
