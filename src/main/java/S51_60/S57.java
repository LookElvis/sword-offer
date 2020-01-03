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
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else {
            while (pNode.next != null && pNode.next.right == pNode) {
                pNode = pNode.next;
            }
            return pNode.next;
        }
    }
}
