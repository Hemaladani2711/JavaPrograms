public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        while(l1 !=null || l2 != null ){
            l3.next=new ListNode(l1.val);
            l3 = l3.next;
            l3.next = new ListNode(l2.val);
            l3 = l3.next;
        }

        return l3.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
