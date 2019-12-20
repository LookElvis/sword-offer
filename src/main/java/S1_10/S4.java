package S1_10;


import PublicClass.TreeNode;
import PublicClass.Utils;

import java.util.Arrays;

/**
 * Created by Elvis on 2019/12/16.
 */
public class S4 {
    public static void main(String[] args) {
        int[] pre = new int[]{1,2,4,7,3,5,6,8};
        int[] in = new int[]{4,7,2,1,5,3,8,6};
        TreeNode t = reConstructBinaryTree(pre, in);
        Utils.printLevelTree(t);
    }

    public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode h = new TreeNode(pre[0]);
        int index = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                index = i;
            }
        }
        int[] in1 = Arrays.copyOfRange(in, 0, index);
        int[] in2 = Arrays.copyOfRange(in, index + 1, in.length);
        int[] p1 = Arrays.copyOfRange(pre, 1, in1.length + 1);
        int[] p2 = Arrays.copyOfRange(pre, in1.length + 1, pre.length);
        h.left = reConstructBinaryTree(p1, in1);
        h.right = reConstructBinaryTree(p2, in2);
        return h;
    }
}
