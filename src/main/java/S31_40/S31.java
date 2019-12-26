package S31_40;

/**
 * 整数中1出现的次数(从1到n整数中1出现的次数)
 * Created by Elvis on 2019/12/26.
 */
public class S31 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(217));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m;
            int b = n % m;
            count += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return count;
    }
}
