package S21__30;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * Created by Elvis on 2019/12/23.
 */
public class S21 {
    public static void main(String[] args) {
        int[] pushA = new int[] {1,2,3,4,5};
        int[] popA = new int[] {3,4,1,2,5};
        System.out.println(IsPopOrder(pushA, popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
