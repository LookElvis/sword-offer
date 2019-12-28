package S21_30;

import PublicClass.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 字符串的排列
 * Created by Elvis on 2019/12/24.
 */
public class S27 {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = Permutation(s);
        Utils.printArrayList(list);
    }

    public static ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        Set<String> set = new TreeSet<>();
        helper(str.toCharArray(), 0, set);
        return new ArrayList<>(set);
    }

    public static void helper(char[] s, int i, Set<String> set) {
        if (i == s.length) {
            set.add(String.valueOf(s));
        }
        for (int j = i; j < s.length; j++) {
            swap(s, i, j);
            helper(s, i + 1, set);
            swap(s, i, j);
        }
    }

    public static void helper1(char[] s, int i) {
        if (i == s.length) {
            System.out.println(String.valueOf(s));
        }
        HashSet<Character> set = new HashSet<>();
        for (int j = i; j < s.length; j++) {
            if (!set.contains(s[j])) {
                set.add(s[j]);
                swap(s, i, j);
                helper1(s, i + 1);
                swap(s, i, j);
            }
        }
    }

    public static void swap(char[] s, int i, int j) {
        if (i == j) {
            return;
        }
        s[i] ^= s[j];
        s[j] ^= s[i];
        s[i] ^= s[j];
    }
}
