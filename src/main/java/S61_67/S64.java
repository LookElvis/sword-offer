package S61_67;

import PublicClass.Utils;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 滑动窗口的最大值
 * Created by Elvis on 2020/1/4.
 */
public class S64 {
    public static void main(String[] args) {
        int[] num = new int[] {2,3,4,2,6,2,5,1};
        int size = 3;
        ArrayList<Integer> list = maxInWindows(num, size);
        Utils.printArrayList(list);
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        ArrayList<Integer> list = new ArrayList<>();
        if (num.length < size || size == 0) {
            return list;
        }
        for (int i = 0; i < size; i++) {
            queue.offer(num[i]);
        }
        list.add(queue.peek());
        for (int p1 = 0, p2 = size; p2 < num.length; p1++, p2++) {
            queue.remove(num[p1]);
            queue.offer(num[p2]);
//            Object[] objs = queue.toArray();
//            for (Object o : objs) {
//                System.out.print(o + " ");
//            }
//            System.out.println();
            list.add(queue.peek());
        }
        return list;
    }
}
