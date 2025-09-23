package solutions;

public class RemoveDuplicatesfromSortedList {


    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {

                current.next = current.next.next;
            } else {

                current = current.next;
            }
        }

        return head;


    }



    public static void main(String[] arg) {

        ListNode val3 = new ListNode(2);
        ListNode val2 = new ListNode(1,val3);
        ListNode val1 = new ListNode(1,val2);

        RemoveDuplicatesfromSortedList t = new RemoveDuplicatesfromSortedList();

        System.out.println(t.deleteDuplicates(val1).val);


    }
}
