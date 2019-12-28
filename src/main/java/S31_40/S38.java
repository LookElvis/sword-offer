package S31_40;

import PublicClass.TreeNode;
import PublicClass.Utils;

/**
 * 
 * Created by Elvis on 2019/12/28.
 */
public class S38 {
    public static void main(String[] args) {
        TreeNode head = Utils.createTree1();
    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}
