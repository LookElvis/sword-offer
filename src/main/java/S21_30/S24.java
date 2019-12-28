package S21_30;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * Created by Elvis on 2019/12/23.
 */
public class S24 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(12);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(7);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        Utils.printTree(root);
        ArrayList<ArrayList<Integer>> list = FindPath(root, 22);
        for (ArrayList<Integer> i : list) {
            Utils.printArrayList(i);
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        tranverse(root, target);
        return result;
    }
    public static void tranverse(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (target == root.val && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        FindPath(root.left, target - root.val);
        FindPath(root.right, target - root.val);
        list.remove(list.size() - 1);
        return;
    }
}
