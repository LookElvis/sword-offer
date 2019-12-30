package S41_50;

/**
 * 把字符串转换成整数
 * Created by Elvis on 2019/12/30.
 */
public class S49 {
    public static void main(String[] args) {
        System.out.println(StrToInt1("-da22"));
//        System.out.println(Integer.parseInt("-2147483647"));
    }

    public static int StrToInt1(String str) {
        Integer res = 0;
        try {
            res = new Integer(str);
        } catch (NumberFormatException e) {
        } finally {
            return res;
        }
    }

    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        boolean isNeg = false;
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            isNeg = true;
            str = str.substring(1);
        }
        char[] chars = str.toCharArray();
        double res = 0;
        int pow = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (!Character.isDigit(chars[i])) {
                return 0;
            } else {
                res += pow * (chars[i] - '0');
                pow *= 10;
            }
        }
        if (!isNeg) {
            if (res >  Integer.MAX_VALUE) {
                return 0;
            } else {
                return (int) res;
            }
        } else {
            if (-res < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) -res;
            }
        }
    }
}
