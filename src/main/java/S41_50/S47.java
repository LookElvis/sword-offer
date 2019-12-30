package S41_50;

/** 求1+2+3+...+n
 * Created by Elvis on 2019/12/30.
 */
public class S47 {
    public static void main(String[] args) {
        System.out.println(Sum_Solution1(4));
    }

    public static int Sum_Solution1(int n) {
        return ((1 + n) * n) >> 1;
    }

    public static int Sum_Solution(int n) {
        if (n == 1) return 1;
        return Sum_Solution(n - 1) + n;
    }
}
