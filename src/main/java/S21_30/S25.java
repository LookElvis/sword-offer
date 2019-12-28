package S21_30;

/**
 * 复杂链表的复制
 * Created by Elvis on 2019/12/24.
 */
public class S25 {
    public static void main(String[] args) {
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);
        RandomListNode n4 = new RandomListNode(4);
        RandomListNode n5 = new RandomListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n1.random = n4;
        n2.random = n5;
        n4.random = n2;
        n5.random = n1;
        RandomListNode result = Clone(n1);
        while (result != null) {
            if (result.random != null) {
                System.out.println(result.label + " cur:" + result.label + " random:" + result.random.label);
            } else {
                System.out.println(result.label + " cur:" + result.label + " random:null");
            }
            result = result.next;
        }
    }

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode currentNode = pHead;
        //1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
        while (currentNode != null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        currentNode = pHead;
        //2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
        while (currentNode != null) {
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        //3、拆分链表，将链表拆分为原链表和复制后的链表
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (currentNode != null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }

        return pCloneHead;
    }

//    public static RandomListNode Clone(RandomListNode pHead) {
//    	RandomListNode head = pHead;
//    	RandomListNode newNode = null;
//    	RandomListNode tmp = null;
//    	while (head != null) {
//    		newNode = new RandomListNode(head.label);
//    		tmp = head.next;
//    		head.next = newNode;
//    		newNode.next = tmp;
//            head = head.next.next;
//        }
//    	RandomListNode pre = pHead;
//    	RandomListNode suf = pre.next;
//        RandomListNode h = new RandomListNode(suf.label);
//        h.next = suf.next;
//        h.random = suf.random;
//    	while (pre != null) {
//            if (pre.random != null) {
//    			suf.random = pre.random.next;
//    		}
//            pre = pre.next.next;
//    		if (pre != null && pre.next != null) {
//    			suf.next = pre.next;
//    		}
//    		suf = suf.next;
//    	}
//    	return h;
//    }
}
