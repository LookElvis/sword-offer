package S21__30;

import PublicClass.Utils;

import java.util.ArrayList;

/**
 * 最小的K个数
 * Created by Elvis on 2019/12/24.
 */
public class S29 {
    public static void main(String[] args) {
        int[] input = new int[] {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(input, 8);
        Utils.printArrayList(list);
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || input.length == 0 || k > input.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                minIndex = input[j] < input[minIndex] ? j : minIndex;
            }
            list.add(input[minIndex]);
            swap(input, i, minIndex);
        }
        return list;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
