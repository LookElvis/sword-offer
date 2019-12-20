package Algorithm.SwordForOffer.S1_10;

/**
 * Created by Elvis on 2019/12/19.
 */
public class S9 {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(0));
    }

    public static int JumpFloorII(int target) {
        return target == 0 ? 1 : (int) Math.pow(2, target - 1);
    }
}
