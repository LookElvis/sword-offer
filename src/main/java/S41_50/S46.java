package S41_50;

import java.util.ArrayList;
import java.util.List;

/**
 * 圆圈中最后剩下的数
 * Created by Elvis on 2019/12/30.
 */
public class S46 {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(6, 3));
    }

    public static int LastRemaining_Solution1(int n, int m) {
        if (n < 1 || m < 1) return -1;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % n;
        }
        return ans;
    }

    public static int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int cur = -1;
        while (list.size() > 1) {
            for (int i = 0; i < m; i++) {
                cur++;
                if (cur == list.size()) {
                    cur = 0;
                }
            }
            list.remove(cur);
            cur--;
        }
        return list.get(0);
    }
}
