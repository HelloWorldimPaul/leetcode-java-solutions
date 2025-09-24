package solutions;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

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

        ListNode val3 = new ListNode(2);
        ListNode val2 = new ListNode(4, val3);
        ListNode val1 = new ListNode(3, val2);

        ListNode val6 = new ListNode(5);
        ListNode val5 = new ListNode(6, val6);
        ListNode val4 = new ListNode(4, val5);

        AddTwoNumbers t = new AddTwoNumbers();

        System.out.println(t.addTwoNumbers(val3, val6).val);
        System.out.println(t.addTwoNumbers(val3, val6).next.val);
        System.out.println(t.addTwoNumbers(val3, val6).next.next);

    }
}
