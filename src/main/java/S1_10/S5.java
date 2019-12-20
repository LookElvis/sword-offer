package S1_10;

import java.util.Stack;

/**
 * Created by Elvis on 2019/12/17.
 */
public class S5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {

    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.empty()) {
            return stack2.pop();
        } else {
            return -1;
        }
    }
}
