package S21_30;

import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.Stack;

/**
 * 二叉搜索树与双向链表
 * Created by Elvis on 2019/12/24.
 */
public class S26 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(12);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(7);
//        root.left = n1;
//        root.right = n2;
//        n1.left = n3;
//        n1.right = n4;
        Utils.printTree(root);
        TreeNode res = Convert(root);
        while (res != null) {
            System.out.println(res.val);
            res = res.right;
        }
    }

    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
    	TreeNode head = pRootOfTree;
    	TreeNode tmp = null;
        Stack<TreeNode> stack = new Stack<>();
    	while (head != null || !stack.empty()) {
    		if (head != null) {
    			stack.push(head);
    			head = head.left;
    		} else {
    			TreeNode pop = stack.pop();
    			head = pop;
    			if (tmp != null) {
    				tmp.right = pop;
    			}
    			pop.left = tmp;
    			tmp = pop;
                head = head.right;
    		}
    	}
        while (tmp.left != null) {
            tmp = tmp.left;
        }
        return tmp;
    }
}
