package S21_30;

/**
 * 连续子数组的最大和
 * Created by Elvis on 2019/12/24.
 */
public class S30 {
    public static void main(String[] args) {
        int[] arr = new int[] {-1,6,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1] > 0 ? array[i - 1] : 0;
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
