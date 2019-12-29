package S41_50;

/**
 * 翻转单词顺序列
 * Created by Elvis on 2019/12/29.
 */
public class S44 {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(ReverseSentence(str));
    }

    public static String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] strings = str.split(" ");
        if (strings.length <= 1) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == strings.length - 1) {
                sb.append(strings[i]);
            } else {
                sb.append(" " + strings[i]);
            }
        }
        return sb.toString();
    }
}
