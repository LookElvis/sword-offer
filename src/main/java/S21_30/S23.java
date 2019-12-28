package S21_30;

/**
 * 二叉搜索树的后序遍历序列
 * Created by Elvis on 2019/12/23.
 */
public class S23 {
    public static void main(String[] args) {
        int[] sequence = {6, 11, 14, 13, 18, 21, 12};
        System.out.println(VerifySquenceOfBST(sequence));
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    public static boolean verify(int[] array, int begin, int end) {
        if (end - begin < 2) return true;
        int key = array[end];
        int i;
        for (i = begin; i < end; i++) {
            if (array[i] > key) break;
        }
        for (int j = i + 1; j < end; j++) {
            if (array[j] < key) return false;
        }
        return verify(array, begin, i - 1) && verify(array, i, end - 1);
    }
}
