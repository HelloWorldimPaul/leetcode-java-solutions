package solutions;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }

        if(carry > 0){

            current.next = new ListNode(carry);

        }

        return dummy.next;

    }

    public static void main(String[] arg) {

        ListNode f1 = new ListNode(3);
        ListNode f2 = new ListNode(4, f1);
        ListNode f3 = new ListNode(2, f2);

        ListNode s1 = new ListNode(4);
        ListNode s2 = new ListNode(6, s1);
        ListNode s3 = new ListNode(5, s2);

        AddTwoNumbers t = new AddTwoNumbers();

        System.out.println(t.addTwoNumbers(f3, s3).val);
        System.out.println(t.addTwoNumbers(f3, s3).next.val);
        System.out.println(t.addTwoNumbers(f3, s3).next.next.val);

    }
}
