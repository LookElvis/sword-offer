package S61_67;

import PublicClass.TreeNode;
import PublicClass.Utils;

/**
 * 序列化二叉树
 * Created by Elvis on 2020/1/3.
 */
public class S61 {
    public static void main(String[] args) {
        TreeNode root = Utils.createTree1();
        System.out.println(Serialize(root));
        String str = "10!5!1!4!#!#!#!6!#!#!9!7!#!8!#!#!3!#!#!";
        TreeNode res = Deserialize(str);
        Utils.printTree(res);
    }

    static String Serialize(TreeNode root) {
        if (root == null) return "#!";
        return root.val + "!" + Serialize(root.left) + Serialize(root.right);
    }

    static TreeNode Deserialize(String str) {
        String[] strings = str.split("!");
        return helper(strings);
    }

    static int index = -1;
    static TreeNode helper(String[] strings) {
        index++;
        if (index >= strings.length) return null;
        TreeNode tNode = null;
        if (!strings[index].equals("#")) {
            tNode = new TreeNode(Integer.parseInt(strings[index]));
            tNode.left = helper(strings);
            tNode.right = helper(strings);
        }
        return tNode;
    }
}
