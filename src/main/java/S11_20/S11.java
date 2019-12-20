package S11_20;

/**
 * Created by Elvis on 2019/12/19.
 */
public class S11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(Integer.MIN_VALUE + 1));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE + 1));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
