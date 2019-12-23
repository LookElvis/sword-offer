package S11_20;

import PublicClass.Utils;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * Created by Elvis on 2019/12/22.
 */
public class S19 {
    public static void main(String[] args) {
        int[][] m = new int[][] {
                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16},
        };
        ArrayList<Integer> list = printMatrix(m);
        Utils.printArrayList(list);
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int row1 = 0;
        int col1 = 0;
        int row2 = matrix.length - 1;
        int col2 = matrix[0].length - 1;
        while (row1 <= row2 && col1 <= col2) {
            printLevel(list, matrix, row1++, col1++, row2--, col2--);
        }
        return list;
    }

    public static void printLevel(ArrayList<Integer> list, int[][] matrix,
                                  int row1, int col1, int row2, int col2) {
        if (row1 == row2) {
            for (int i = col1; i <= col2; i++) {
                list.add(matrix[row1][i]);
            }
        } else if (col1 == col2){
            for (int i = row1; i <= row2; i++) {
                list.add(matrix[i][col1]);
            }
        } else {
            int curRow = row1;
            int curCol = col1;
            while (curCol < col2) {
                list.add(matrix[curRow][curCol++]);
            }
            while (curRow < row2) {
                list.add(matrix[curRow++][curCol]);
            }
            while (curCol > col1) {
                list.add(matrix[curRow][curCol--]);
            }
            while (curRow > row1) {
                list.add(matrix[curRow--][curCol]);
            }
        }
    }
}
