package S31_40;

/**
 * 丑数
 * Created by Elvis on 2019/12/27.
 */
public class S33 {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }

    public static int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        int[] num = new int[index + 1];
        num[1] = 1;
        int index2 = 1;
        int index3 = 1;
        int index5 = 1;
        for (int i = 2; i <= index; i++) {
            num[i] = Math.min(num[index2] * 2, num[index3] * 3);
            num[i] = Math.min(num[i], num[index5] * 5);
            if (num[i] == num[index5] * 5) {
                index5++;
            }
            if (num[i] == num[index3] * 3) {
                index3++;
            }
            if (num[i] == num[index2] * 2) {
                index2++;
            }
        }
        return num[index];
    }
}
