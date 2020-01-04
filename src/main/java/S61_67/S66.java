package S61_67;

/**
 * 机器人的运动范围
 * Created by Elvis on 2020/1/4.
 */
public class S66 {
    public static void main(String[] args) {
        int threshold = 16;
        int rows = 20;
        int cols = 20;
        System.out.println(movingCount(threshold, rows, cols));
    }

    public static int movingCount(int threshold, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = isAccess(threshold, i, j);
            }
        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int res = helper(matrix, 0, 0, rows, cols);
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return res;
        return helper(matrix, 0, 0, rows, cols);
    }

    public static int helper(int[][] matrix, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[i][j] != 1) {
            return 0;
        }
        matrix[i][j]++;
        return helper(matrix, i - 1, j, rows, cols)
                + helper(matrix, i + 1, j, rows, cols)
                + helper(matrix, i, j - 1, rows, cols)
                + helper(matrix, i, j + 1, rows, cols)
                + 1;
    }

    public static int isAccess(int threshold, int row, int col) {
        int count = 0;
        while (row != 0) {
            count += row % 10;
            row /= 10;
        }
        while (col != 0) {
            count += col % 10;
            col /= 10;
        }
        return count <= threshold ? 1 : 0;
    }
}
