public class n206_reverse_linked_list {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseList(head);

//        ListNode print = head;
//        while (print != null){
//            System.out.print(print.toString());
//            System.out.print("->");
//            print = print.next;
//        }
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

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode nextNode = head.next;
        System.out.println("1. nextNode : "+ nextNode.val);

        ListNode newHead = reverseList(nextNode); //5
        System.out.println("2. newHead : "+ newHead.val);
        nextNode.next = head;
        System.out.println("3. nextNode.next : "+ nextNode.next.val);

        System.out.println("----------------------------------------");
        head.next = null;
        return newHead;
    }
}
