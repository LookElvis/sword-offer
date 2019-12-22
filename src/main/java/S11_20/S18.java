package S11_20;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Elvis on 2019/12/22.
 */
public class S18 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        root1.left = n1;
        root1.right = n2;
        n2.left = n3;
        n3.right = n4;
        Utils.printTree(root1);
        Mirror(root1);
        Utils.printTree(root1);
    }

    public static void Mirror(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.left != null && root.right != null) {
                TreeNode t = root.left;
                root.left = root.right;
                root.right = t;
                queue.add(root.left);
                queue.add(root.right);
            } else if (root.left != null && root.right == null) {
                root.right = root.left;
                root.left = null;
                queue.add(root.right);
            } else if (root.left == null && root.right != null) {
                root.left = root.right;
                root.right = null;
                queue.add(root.left);
            }
        }
    }

    public static void Mirror1(TreeNode root) {
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror1(root.left);
        Mirror1(root.right);
    }
}
