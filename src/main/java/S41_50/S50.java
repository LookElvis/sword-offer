package S41_50;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 * Created by Elvis on 2019/12/31.
 */
public class S50 {
    public static void main(String[] args) {
        int[] numbers = new int[] {6,3,1,0,2,5,3};
        int[] duplication = new int[1];
        duplicate1(numbers, numbers.length, duplication);
        System.out.println(duplication[0]);
    }

    public static boolean duplicate1(int numbers[],int length,int [] duplication) {
        if (numbers == null || length < 2) return false;
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    public static void swap (int[] arr, int i, int j) {
        if (i == j) return;
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length < 2) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!set.contains(numbers[i])) {
                set.add(numbers[i]);
            } else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
