package S1_10;

/**
 * 斐波那契数列
 * Created by Elvis on 2019/12/18.
 */
public class S7 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int pre1 = 1;
        int pre2 = 1;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = pre1 + pre2;
            pre1 = pre2;
            pre2 = res;
        }
        return res;
    }
}
