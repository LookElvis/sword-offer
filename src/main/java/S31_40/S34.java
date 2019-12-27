package S31_40;

import java.util.*;

/**
 * 第一次只出现一次的字符
 * Created by Elvis on 2019/12/27.
 */
public class S34 {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abcdeffgabcde"));
    }

    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

//    public static int FirstNotRepeatingChar(String str) {
//        if (str == null || str.length() == 0) return -1;
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
//        }
//        Iterator<Character> it = map.keySet().iterator();
//        char tChar = '0';
//        boolean isTure = false;
//        while (it.hasNext()) {
//            char t = it.next();
//            if (map.get(t) == 1) {
//                tChar = t;
//                isTure = true;
//                break;
//            }
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == tChar && isTure) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
