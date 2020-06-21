package S21_30;

import PublicClass.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 最小的K个数
 * Created by Elvis on 2019/12/24.
 */
public class S29 {
    public static void main(String[] args) {
        int[] input = new int[] {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(input, 4);
        Utils.printArrayList(list);
    }

    public static List<Integer> GetLeastNumbers_Solution1(int[] array, int k) {
        List<Integer> res = new ArrayList<>();
        if (array == null || array.length == 0) {
            return res;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.add(array[i]);
        }
        for (int i = 0; i < k; i++) {
            res.add(priorityQueue.poll());
        }
        return res;
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
