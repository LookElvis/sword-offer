package S31_40;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Created by Elvis on 2019/12/28.
 */
public class S38 {
    public static void main(String[] args) {
        TreeNode root = Utils.createTree2();
        System.out.println(TreeDepth1(root));
    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }

    public static int TreeDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        int levelCount = 0;
        int qSize = queue.size();
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            levelCount++;
            if (t.left != null) queue.add(t.left);
            if (t.right != null) queue.add(t.right);
            if (levelCount == qSize) {
                levelCount = 0;
                qSize = queue.size();
                count++;
            }
        }
        return count;
    }
}
