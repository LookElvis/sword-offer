package S1_10;

/**
 * 替换空格
 * Created by Elvis on 2019/12/13.
 */
public class S2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy.");
        System.out.println(replaceSpace(sb));
    }
    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) return "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                str.insert(i, "%20");
            }
        }
        return str.toString();
    }
}
