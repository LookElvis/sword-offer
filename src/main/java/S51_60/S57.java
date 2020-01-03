package S51_60;

/**
 * 二叉树的下一个结点
 * Created by Elvis on 2020/1/3.
 */
public class S57 {
    public static void main(String[] args) {

    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        TreeLinkNode t = pNode;
        if (t.right != null) {
            t = t.right;
            while (t.left != null) {
                t = t.left;
            }
            return t;
        } else {
            while (t.next != null && t.next.right == t) {
                t = t.next;
            }
            return t.next;
        }
    }
}
