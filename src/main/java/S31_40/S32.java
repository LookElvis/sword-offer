package S31_40;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 把数组排成最小的数
 * Created by Elvis on 2019/12/26.
 */
public class S32 {
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 32, 321};
        System.out.println(PrintMinNumber(numbers));
    }

    public static String PrintMinNumber(int [] numbers) {
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]);
        }
        return sb.toString();
    }
}
