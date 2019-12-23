package S11_20;

import PublicClass.TreeNode;


/**
 * 树的子结构
 * Created by Elvis on 2019/12/21.
 */
public class S17 {
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

        TreeNode root2 = new TreeNode(3);
//        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        root2.left = t2;
        t2.right = t4;
//        root2.right = t2;
//        t2.left = t3;
//        t3.right = t4;
        System.out.println(HasSubtree(root1, root2));
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return isSubTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public static boolean isSubTree(TreeNode tree1, TreeNode tree2){
        if (tree2 == null) return true;
        if (tree1 == null) return false;
        if (tree1.val != tree2.val) return false;
        return isSubTree(tree1.left, tree2.left) && isSubTree(tree1.right, tree2.right);
    }

//    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
//        if (root2 == null) return false;
//        Stack<TreeNode> stack = new Stack<>();
//        while (!stack.empty() || root1 != null) {
//            if (root1 != null) {
//                stack.push(root1);
//                root1 = root1.left;
//            } else {
//                root1 = stack.pop();
//                if (root1.val == root2.val && isSubTree(root1, root2)) {
//                    return true;
//                }
//                root1 = root1.right;
//            }
//        }
//        return false;
//    }

//    public static boolean isSubTree(TreeNode root1, TreeNode root2) {
//        Queue<TreeNode> q1 = new LinkedList<>();
//        Queue<TreeNode> q2 = new LinkedList<>();
//        q1.add(root1);
//        q2.add(root2);
//        while (!q2.isEmpty()) {
//            TreeNode t1 = q1.poll();
//            TreeNode t2 = q2.poll();
//            if (t1.val != t2.val) {
//                return false;
//            } else {
//                if (t1.left != null && t2.left != null) {
//                    q1.add(t1.left);
//                    q2.add(t2.left);
//                } else if (t1.left == null && t2.left != null){
//                    return false;
//                }
//                if (t1.right != null && t2.right != null) {
//                    q1.add(t1.right);
//                    q2.add(t2.right);
//                } else if (t1.right == null && t2.right != null){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}
