package S1_10;

/**
 * Created by Elvis on 2019/12/17.
 */
public class S6 {
    public static void main(String[] args) {
        int[] array = new int[]{3,4,5,1,2,3,4};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 1) return array[0];
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int m = l + ((r - l) >> 1);
            if (array[l] < array[r]) {
                return array[l];
            }
            if (array[m] > array[m + 1]) {
                return array[m + 1];
            }
            if (array[m] < array[m - 1]) {
                return array[m];
            }
            if (array[m] > array[0]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return 0;
    }

    public static int minNumberInRotateArray1(int [] array) {
        if (array.length == 0) return 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return array[i];
            }
        }
        return array[0];
    }
}
