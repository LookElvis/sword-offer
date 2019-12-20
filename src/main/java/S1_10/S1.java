package S1_10;

/**
 * 二维数组中的查找
 * Created by Elvis on 2019/12/13.
 */
public class S1 {
    public static void main(String[] args) {

    }
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0) return false;
        if (array[0].length == 0) return false;
        int row = array.length - 1;
        int col = 0;
        do {
            if (array[row][col] < target) {
                col++;
            } else if (array[row][col] > target) {
                row--;
            } else {
                return true;
            }
        } while (row >= 0 && col < array[0].length);
        return false;
    }
}
