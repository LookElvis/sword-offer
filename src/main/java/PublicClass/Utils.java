package PublicClass;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Created by liuxiang on 2018/10/11.
 */
public class Utils {
    public static void printLinkedList(ListNode root) {
        while (root != null) {
            System.out.print(root.val + "->");
            root =  root.next;
        }
        System.out.println();
    }

    public static void printMiddleTree(TreeNode root) {
        if(root != null) {
            printMiddleTree(root.left);
            System.out.print(root.val + "->");
            printMiddleTree(root.right);
        }
    }

    public static void printLevelTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + "->");
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public static void printArrayList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void printIntArrays(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void printIntMatrix(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printObjectArrays(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void printObjectMatrix(Object[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printCharArrays(char[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static <T> void printDoubleArrays(List<List<T>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
