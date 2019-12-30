package S41_50;

import PublicClass.Utils;

import java.util.HashSet;
import java.util.Set;

/**
 * 扑克牌顺子
 * Created by Elvis on 2019/12/30.
 */
public class S45 {
    public static void main(String[] args) {
        int[] numbers = new int[] {0,3,2,6,1};
        System.out.println(isContinuous(numbers));
    }

    public static boolean isContinuous(int [] numbers) {
        if (numbers.length == 0 || numbers == null) return false;
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                if (!set.contains(numbers[i])) {
                    set.add(numbers[i]);
                    max = Math.max(max, numbers[i]);
                    min = Math.min(min, numbers[i]);
                } else {
                    return false;
                }
            }
        }
        return max - min + 1 <= numbers.length;
    }
}
