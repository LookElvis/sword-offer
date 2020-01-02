package S51_60;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 字符流中第一个不重复的字符
 * Created by Elvis on 2019/12/31.
 */
public class S54 {
    public static void main(String[] args) {
        Insert('g');
        System.out.println(FirstAppearingOnce());
        Insert('o');
        System.out.println(FirstAppearingOnce());
        Insert('o');
        System.out.println(FirstAppearingOnce());
        Insert('g');
        System.out.println(FirstAppearingOnce());
        Insert('l');
        System.out.println(FirstAppearingOnce());
//        Iterator<Character> it = set1.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next() + "--");
//        }
        Insert('e');
        System.out.println(FirstAppearingOnce());
    }

    int[] count = new int[256]; // 字符出现的次数
    int[] index = new int[256]; // 字符出现的次数
    int number = 0;

    public void Insert1(char ch) {
        count[ch]++;
        index[ch] = number++;
    }

    public char FirstAppearingOnce1() {
        int minIndex = number;
        char ch = '#';
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1 && index[i] < minIndex) {
                ch = (char) i;
                minIndex = index[i];
            }
        }
        return ch;
    }

    public static Set<Character> set1 = new LinkedHashSet<>();
    public static Set<Character> set2 = new HashSet<>();
    public static void Insert(char ch) {
        if (!set1.contains(ch) && !set2.contains(ch)) {
            set1.add(ch);
        } else {
            set1.remove(ch);
            set2.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce() {
        if (set1.isEmpty()) {
            return '#';
        } else {
            char t = set1.iterator().next();
            return t;
        }
    }
}
