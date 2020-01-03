package S51_60;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 把二叉树打印成多行
 * Created by Elvis on 2020/1/3.
 */
public class S60 {
    public static void main(String[] args) {
        TreeNode root = Utils.createTree2();
        ArrayList<ArrayList<Integer>> res = Print(root);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode t;
            ArrayList<Integer> tList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                t = queue.poll();
                tList.add(t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            list.add(tList);
        }
        return list;
    }
}
