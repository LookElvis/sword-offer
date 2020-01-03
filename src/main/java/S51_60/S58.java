package S51_60;

import PublicClass.TreeNode;
import PublicClass.Utils;

/**
 * 对称的二叉树
 * Created by Elvis on 2020/1/3.
 */
public class S58 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(2);
//        root.left = n1;
//        root.right = n2;
//        n1.left = n3;
//        n1.right = n4;
//        n2.left = n5;
//        n2.right = n6;
        Utils.printTree(root);
        System.out.println(isSymmetrical(root));
    }

    static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return helper(pRoot.left, pRoot.right);
    }

    static boolean helper(TreeNode pLeft, TreeNode pRight) {
        if (pLeft == null && pRight == null) return true;
        if (pLeft == null || pRight == null) return false;
        if (pLeft.val == pRight.val) {
            return helper(pLeft.left, pRight.right) && helper(pLeft.right, pRight.left);
        } else {
            return false;
        }
    }
}
