package S51_60;

import PublicClass.ListNode;
import PublicClass.Utils;


/**
 * 链表中环的入口节点
 * Created by Elvis on 2020/1/2.
 */
public class S55 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
//        ListNode n5 = new ListNode(6);
//        ListNode n6 = new ListNode(7);
//        ListNode n7 = new ListNode(8);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n4;
        ListNode res = EntryNodeOfLoop(head);
        System.out.println(res == null ? "null" : res.val);
    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode meetNode = meetNode(pHead);
        if (meetNode == null) return null;
        ListNode p1 = pHead;
        ListNode p2 = meetNode;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static ListNode meetNode(ListNode pHead) {
        ListNode pSlow = pHead;
        ListNode pFast = pHead;
        while (pSlow != null && pFast != null) {
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast!= null) {
                pFast = pFast.next;
            }
            if (pSlow != null && pFast != null && pSlow == pFast) {
                return pSlow;
            }
        }
        return null;
    }
}
