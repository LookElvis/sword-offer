package S61_67;

/**
 * 剪绳子
 * Created by Elvis on 2020/1/4.
 */
public class S67 {
    public static void main(String[] args) {
        System.out.println(cutRope(2));
    }

    public static int cutRope(int target) {
        if (target == 1) return 1;
        int[] m = new int[target + 1];
        m[1] = 1;
        for (int i = 2; i <= target; i++) {
            int max = m[i];
            for (int j = 1; j <= i / 2; j++) {
                max = Math.max(max, Math.max(j, m[j]) * Math.max(i - j, m[i - j]));
            }
            m[i] = max;
        }
        return m[target];
    }
}
