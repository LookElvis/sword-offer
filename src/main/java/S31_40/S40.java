package S31_40;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * Created by Elvis on 2019/12/28.
 */
public class S40 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5, 5, 7, 8, 8};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce1(arr, num1, num2);
        System.out.println(num1[0] + " " + num2[0]);
    }

    public static void FindNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 0) return;
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        int index = 1;
        while ((xor & index) == 0) {
            index <<= 1;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & index) == 0) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 0) return;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                set.remove(array[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        num1[0] = it.next();
        num2[0] = it.next();
    }
}
