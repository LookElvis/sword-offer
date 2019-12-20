package S1_10;

import PublicClass.ListNode;
import PublicClass.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elvis on 2019/12/16.
 */
public class S3 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(7);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(9);
        h.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        List<Integer> list = printListFromTailToHead(h);
        Utils.printArrayList(list);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = listNode;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(0, head.val);
            head = head.next;
        }
//        Collections.reverse(list);
        return list;
    }
}
