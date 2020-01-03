package S51_60;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.*;

/**
 * 按之字形顺序打印二叉树
 * Created by Elvis on 2020/1/3.
 */
public class S59 {
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

    public ArrayList<ArrayList<Integer> > Print1(TreeNode pRoot) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean isRight = true;
        linkedList.add(pRoot);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = linkedList.poll();
                if (node == null) continue;
                if (isRight) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                linkedList.offer(node.left);
                linkedList.offer(node.right);
            }
            if (list.size() != 0) {
                res.add(list);
            }
            isRight = !isRight;
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        boolean isRight = true;
        if (pRoot == null) return list;
        stack1.add(pRoot);
        ArrayList<Integer> tList = new ArrayList<>();
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (isRight && !stack1.isEmpty()) {
                TreeNode t = stack1.pop();
                tList.add(t.val);
                if (t.left != null) stack2.push(t.left);
                if (t.right != null) stack2.push(t.right);
                if (stack1.isEmpty()) {
                    list.add(tList);
                    tList = new ArrayList<>();
                    isRight = false;
                }
                continue;
            }
            if (!isRight && !stack2.isEmpty()) {
                TreeNode t = stack2.pop();
                tList.add(t.val);
                if (t.right != null) stack1.push(t.right);
                if (t.left != null) stack1.push(t.left);
                if (stack2.isEmpty()) {
                    list.add(tList);
                    tList = new ArrayList<>();
                    isRight = true;
                }
                continue;
            }
        }
        return list;
    }
}
