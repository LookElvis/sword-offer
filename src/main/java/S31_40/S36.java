package S31_40;

import PublicClass.ListNode;
import PublicClass.Utils;

/**
 * 两个链表的第一个公共节点
 * Created by Elvis on 2019/12/27.
 */
public class S36 {
    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(2);
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(4);
        ListNode p3 = new ListNode(5);
        ListNode p4 = new ListNode(6);
        ListNode p5 = new ListNode(7);
        ListNode p6 = new ListNode(8);
        ListNode p7 = new ListNode(9);
        pHead1.next = p1;
        p1.next = p2;
        p2.next = p3;

        pHead2.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p3;

        p3.next = p4;

//        pHead1 = null;
//        pHead2 = null;
        Utils.printLinkedList(pHead1);
        Utils.printLinkedList(pHead2);

        ListNode res = FindFirstCommonNode(pHead1, pHead2);
        System.out.println(res == null ? null : res.val);
    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }
        return p1;
    }
}
