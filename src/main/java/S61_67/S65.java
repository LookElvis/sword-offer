package S61_67;

/**
 * 矩阵中的路径
 * Created by Elvis on 2020/1/4.
 */
public class S65 {
    public static void main(String[] args) {
        String matrix = "abcesfcsadee";
        String str = "abcb";
        int rows = 3;
        int cols = 4;
        System.out.println(hasPath(matrix.toCharArray(), rows, cols, str.toCharArray()));
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix, i, j, rows, cols, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean judge(char[] matrix, int i, int j, int rows, int cols, char[] str, int k, boolean[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index]) {
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }
        flag[index] = true;
        if (judge(matrix, i - 1, j, rows, cols, str, k + 1, flag)
                || judge(matrix, i + 1, j, rows, cols, str, k + 1, flag)
                || judge(matrix, i, j - 1, rows, cols, str, k + 1, flag)
                || judge(matrix, i, j + 1, rows, cols, str, k + 1, flag)) {
            return true;
        }
        flag[index] = false;
        return false;
    }
}
