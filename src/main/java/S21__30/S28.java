package S21__30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字
 * Created by Elvis on 2019/12/24.
 */
public class S28 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,2,2,2,7,4,2,1};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int halfLen = array.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int t = it.next();
            if (map.get(t) > halfLen) {
                return t;
            }
        }
        return 0;
    }
}
