package S51_60;

import PublicClass.Utils;

/**
 * 构建乘积数组
 * Created by Elvis on 2019/12/31.
 */
public class S51 {
    public static void main(String[] args) {
        int[] A = new int[] {1,2};
        int[] B = multiply(A);
        Utils.printIntArrays(B);
    }

    public static int[] multiply(int[] A) {
        if (A == null || A.length < 2) return null;
        int[] mul1 = new int[A.length];
        int[] mul2 = new int[A.length];
        mul1[0] = A[0];
        mul2[A.length - 1] = A[A.length - 1];
        for (int i = 1, j = A.length - 2; i < A.length; i++, j--) {
            mul1[i] = mul1[i - 1] * A[i];
            mul2[j] = mul2[j + 1] * A[j];
        }
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            if (i == 0) {
                B[i] = mul2[i + 1];
            } else if (i == B.length - 1) {
                B[i] = mul1[i - 1];
            } else {
                B[i] = mul1[i - 1] * mul2[i + 1];
            }
        }
        return B;
    }
}
