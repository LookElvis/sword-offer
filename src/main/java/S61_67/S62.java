package S61_67;

import PublicClass.TreeNode;
import PublicClass.Utils;

/**
 * 二叉搜索树的第k个节点
 * Created by Elvis on 2020/1/3.
 */
public class S62 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(11);
        TreeNode n6 = new TreeNode(17);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
        Utils.printTree(root);
        TreeNode res = KthNode(root, 5);
        System.out.println(res.val);
    }

    static int index = -1;
    static TreeNode res = null;
    static TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return null;
        index = k;
        inOrderTraverse(pRoot);
        return res;
    }

    static void inOrderTraverse(TreeNode root) {
        if (root != null) {
            inOrderTraverse(root.left);
            index--;
            if (index == 0) {
                res = root;
                return;
            }
            inOrderTraverse(root.right);
        }
    }
}
