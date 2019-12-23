package S21__30;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Elvis on 2019/12/23.
 */
public class S22 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(2);
        root.left = n1;
        root.right = n2;
        n2.left = n3;
//        n2.right = n4;
        Utils.printTree(root);

        Utils.printArrayList(PrintFromTopToBottom(root));
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            root = queue.poll();
            list.add(root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
        return list;
    }
}
