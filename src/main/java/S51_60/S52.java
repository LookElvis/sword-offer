package S51_60;

/**
 * 正则表达式匹配
 * Created by Elvis on 2019/12/31.
 */
public class S52 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "ab*ac*a";
        System.out.println(match(s1.toCharArray(), s2.toCharArray()));
    }

    public static boolean match1(char[] str, char[] pattern) {
        if(str == null || pattern == null)
            return false;
        boolean [][] dp = new boolean[str.length + 1][pattern.length + 1];
        dp[str.length][pattern.length] = true;
        for (int i = str.length; i >= 0; i--) {
            for (int j = pattern.length - 1; j >= 0; j--) {
                if (j < pattern.length - 1 && pattern[j + 1] == '*') {
                    //下一个是'*'且当前字符相等
                    if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                        dp[i][j] = dp[i][j + 2] || dp[i + 1][j];
                    } else { //下一个是'*'且当前字符不等
                        dp[i][j] = dp[i][j + 2];
                    }
                } else { //下一个不是'*'且当前字符相等
                    if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                        dp[i][j] = dp[i + 1][j + 1];
                    }
                }
            }
        }
        return dp[0][0];
    }

    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        return helper(str, 0, pattern, 0);
    }

    public static boolean helper(char[] str, int i, char[] pattern, int j) {
        if (j == pattern.length) {
            return i == str.length;
        }
        //pattern下一个字符是*
        if ((j < pattern.length - 1) && (pattern[j + 1] == '*')) {
            //当前字符匹配
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                return helper(str, i + 1, pattern, j) || helper(str, i, pattern, j + 2);
            } else {
                return helper(str, i, pattern, j + 2);
            }
        } else {
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                return helper(str, i + 1, pattern, j + 1);
            }
        }
        return false;
    }
}
