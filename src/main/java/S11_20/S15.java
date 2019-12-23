package S11_20;

import PublicClass.ListNode;
import PublicClass.Utils;

/**
 * 	反转链表
 * Created by Elvis on 2019/12/21.
 */
public class S15 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode res = ReverseList(head);
        Utils.printLinkedList(res);
    }

    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
