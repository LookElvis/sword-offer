package Algorithm.SwordForOffer.S11_20;

/**
 * Created by Elvis on 2019/12/20.
 */
public class S12 {
    public static void main(String[] args) {
        System.out.println(Power(-1.4, -11));
        System.out.println(Math.pow(-1.4, -11));
    }

    public static double Power(double base, int exponent) {
        if (base == 0) return 0;
        if (exponent == 0) return 1;
        double res = 1;
        for (int i = 1; i <= Math.abs(exponent); i++) {
        	res *= base;
        }
        return exponent > 0 ? res : 1 / res;
  	}
}
