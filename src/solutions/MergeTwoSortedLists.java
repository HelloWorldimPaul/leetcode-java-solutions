package solutions;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }


        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;

    }

    public static void main(String[] args) {

        ListNode node3 = new ListNode(5);
        ListNode node2 = new ListNode(3, node3);
        ListNode list1 = new ListNode(1, node2);

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(4, node6);
        ListNode list2 = new ListNode(2, node5);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        mergeTwoSortedLists.mergeTwoLists(list1,list2);


    }




}


