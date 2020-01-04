package S61_67;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Elvis on 2020/1/4.
 */
public class S63 {
    public static void main(String[] args) {
        Insert(1);
        System.out.println(GetMedian());
        Insert(5);
        System.out.println(GetMedian());
        Insert(8);
        System.out.println(GetMedian());
        Insert(4);
        System.out.println(GetMedian());
        Insert(3);
        System.out.println(GetMedian());
        Insert(9);
        System.out.println(GetMedian());
        Insert(13);
        System.out.println(GetMedian());
    }

    static PriorityQueue<Integer> lHeap = new PriorityQueue<>((a, b) -> b - a);  //大根堆
    static PriorityQueue<Integer> sHeap = new PriorityQueue<>();  //小根堆
    static void Insert(int num) {
        lHeap.add(num);
        sHeap.add(lHeap.remove());
        if (sHeap.size() > lHeap.size()) {
            lHeap.add(sHeap.remove());
        }
    }

    static Double GetMedian() {
        if (sHeap.size() == lHeap.size()) {
            return (sHeap.peek() + lHeap.peek()) / 2.0;
        } else {
            return (double) lHeap.peek();
        }
    }
}
