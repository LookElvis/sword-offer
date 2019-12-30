package S41_50;

/**
 * 不用加减乘除做加法
 * Created by Elvis on 2019/12/30.
 */
public class S48 {
    public static void main(String[] args) {
        System.out.println(Add(9, 7));
    }

    public static int Add(int num1, int num2) {
        int result, ans;
        do {
            result = num1 ^ num2;
            System.out.println(result);
            ans = (num1 & num2) << 1;
            System.out.println(ans + " ----- ");
            num1 = result;
            num2 = ans;
        } while (ans != 0);
        return result;
    }
}
