package S11_20;

import java.util.Stack;

/**
 * Created by Elvis on 2019/12/22.
 */
public class S20 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (minStack.empty()) {
            minStack.push(node);
        } else {
            if (node <= minStack.peek()) {
                minStack.push(node);
            }
        }
    }

    public void pop() {
        if (stack.peek() == minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}

