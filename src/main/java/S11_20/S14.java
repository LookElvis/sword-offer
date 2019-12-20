package S11_20;


import PublicClass.ListNode;

/**
 * Created by Elvis on 2019/12/20.
 */
public class S14 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.println(FindKthToTail(n1, 0).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
    	if (head == null) return null;
    	ListNode fast = head;
    	ListNode slow = head;
    	while (k-- > 0) {
    		if (fast != null) {
    			fast = fast.next;	
    		} else {
    		    return null;
            }
    	}
        while (fast != null) {
    		fast = fast.next;
    		slow = slow.next;
    	}
    	return slow;
    }    
}
