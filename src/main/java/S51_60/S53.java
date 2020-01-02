package S51_60;

import java.util.regex.Pattern;

/**
 * 表示数值的字符串
 * Created by Elvis on 2019/12/31.
 */
public class S53 {
    public static void main(String[] args) {
        String s = "1.2.3";
        System.out.println(isNumeric(s.toCharArray()));
    }

    public static boolean isNumeric1(char[] str) {
        String pattern = "^[-+]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$";
        return Pattern.matches(pattern, new String(str));
    }

    public static boolean isNumeric(char[] str) {
        boolean point = false;
        boolean exp = false;  //标识小数点和指数，只能出现一次
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '+' || str[i] == '-') {
                if (i + 1 == str.length || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '.')) {
                    return false;
                }
                if (!(i == 0 || str[i-1] == 'e' || str[i-1] == 'E')) {
                    return false;
                }
            } else if (str[i] == '.') {
                if (point || exp || !(i + 1 < str.length && str[i + 1] >= '0' && str[i + 1] <= '9')) {
                    return false;
                }
                point = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (exp || i + 1 == str.length || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '+' || str[i + 1] == '-')) {
                    return false;
                }
                exp = true;
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
