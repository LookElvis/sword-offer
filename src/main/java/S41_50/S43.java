package S41_50;

/**
 * 左旋转字符串
 * Created by Elvis on 2019/12/29.
 */
public class S43 {
    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef", 9));
    }
    
    public static String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0) return str;
        int len = n % str.length();
        if (len == 0) return str;
        return new StringBuilder(str.substring(len)).append(str.substring(0, len)).toString();
    }
}
