package S1_10;

/**
 * 替换空格
 * Created by Elvis on 2019/12/13.
 */
public class S2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace1(sb));
    }

    public static String replaceSpace2(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String replaceSpace1(StringBuffer str) {
        if (str == null || str.length() == 0) return "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        int oldLen = str.length();
        str.setLength(oldLen + 2 * count);
        for (int i = oldLen - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                str.setCharAt(i + 2 * count, str.charAt(i));
            } else {
                str.setCharAt(i + 2 * count, '0');
                str.setCharAt(i + 2 * count - 1, '2');
                str.setCharAt(i + 2 * count - 2, '%');
                count--;
            }
        }
        return str.toString();
    }

    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) return "";
        return str.toString().replace(" ","%20");
    }
}
