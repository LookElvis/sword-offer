package S51_60;

import PublicClass.ListNode;
import PublicClass.Utils;

import java.util.List;

/**
 * 删除链表中重复的节点
 * Created by Elvis on 2020/1/2.
 */
public class S56 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        ListNode res = deleteDuplication(head);
        Utils.printLinkedList(res);
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return pHead;
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;
        ListNode pre = dummy, cur = pHead;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = cur;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public static ListNode deleteDuplication1(ListNode pHead) {
        if (pHead == null) return pHead;
        ListNode h = new ListNode(-1);
        ListNode pre = h;
        pre.next = pHead;
        ListNode cur = pHead;
        ListNode tmp = pHead;
        boolean isSingle = true;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                isSingle = false;
            } else {
                if (isSingle) {
                    pre.next = tmp;
                    pre = pre.next;
                }
                tmp = cur.next;
                isSingle = true;
            }
            cur = cur.next;
        }
        if (isSingle) {
            pre.next = tmp;
        } else {
            pre.next = null;
        }
        return h.next;
    }
}
