package S31_40;

import PublicClass.TreeNode;
import PublicClass.Utils;

/**
 * 平衡二叉树
 * Created by Elvis on 2019/12/28.
 */
public class S39 {
    public static void main(String[] args) {
        TreeNode root = Utils.createTree2();
        System.out.println(IsBalanced_Solution(root));
    }

    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1) {
            return false;
        } else {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}
