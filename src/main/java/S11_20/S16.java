package S11_20;

import PublicClass.ListNode;
import PublicClass.Utils;

/**
 * Created by Elvis on 2019/12/21.
 */
public class S16 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(11);
        head1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode head2 = new ListNode(1);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(7);
        ListNode n7 = new ListNode(9);
        head2.next = n5;
        n5.next = n6;
//        n6.next = n7;

        ListNode head = Merge(head1, head2);
        Utils.printLinkedList(head);
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) {
            cur.next = list1;
        }
        if (list2 != null) {
            cur.next = list2;
        }
        return head.next;
    }
}
