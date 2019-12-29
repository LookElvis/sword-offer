package S41_50;

import PublicClass.Utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 和为S的两个数
 * Created by Elvis on 2019/12/29.
 */
public class S42 {
    public static void main(String[] args) {
        int array[] = new int[] {1, 4, 6, 7, 10};
        ArrayList<Integer> list = FindNumbersWithSum1(array, 11);
        Utils.printArrayList(list);
    }

    public static ArrayList<Integer> FindNumbersWithSum1(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2) return list;
        int mul = Integer.MAX_VALUE;
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int tmp = array[left] + array[right];
            if (tmp < sum) {
                left++;
            } else if (tmp > sum) {
                right--;
            } else if (array[left] * array[right] < mul) {
                list.clear();
                list.add(array[left]);
                list.add(array[right]);
                mul = array[left] * array[right];
            }
        }
        return list;
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2) return list;
        int mul = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int rest = sum - array[i];
            if (rest <= array[i]) {
                break;
            }
            int index = Arrays.binarySearch(array, rest);
            if (index >= 0 && array[i] * array[index] < mul) {
                list.clear();
                list.add(array[i]);
                list.add(rest);
                mul = array[i] * array[index];
            }
        }
        return list;
    }
}
