package Algorithm.SwordForOffer.S1_10;

/**
 * Created by Elvis on 2019/12/18.
 */
public class S8 {
    public int JumpFloor(int target) {
        if (target < 2) return 1;
        int pre = 1;
        int sum = 1;
        for (int i = 2; i <= target; i++) {
            sum = sum + pre;
            pre = sum - pre;
        }
        return sum;
    }
}
