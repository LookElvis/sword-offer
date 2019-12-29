package S41_50;

import PublicClass.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为S的连续正数序列
 * Created by Elvis on 2019/12/29.
 */
public class S41 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(99);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= sum / 2; i++) {
            for (int j = i + 1; j <= sum / 2 + 1; j++) {
                int tmp = (i + j) * (j - i + 1);
                if (tmp == sum * 2) {
                    ArrayList<Integer> tList = new ArrayList<>();
                    for (int m = i; m <= j; m++) {
                        tList.add(m);
                    }
                    list.add(tList);
                    break;
                }
            }
        }
        return list;
    }
}
