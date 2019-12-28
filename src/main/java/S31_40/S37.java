package S31_40;

/**
 * 数字在排序数组中出现的次数
 * Created by Elvis on 2019/12/28.
 */
public class S37 {
    public static void main(String[] args) {
        int[] arr = new int[] {3};
        System.out.println(GetNumberOfK(arr,3));
    }

    public static int GetNumberOfK(int [] array , int k) {
        if (array.length == 0 || array == null) return 0;
        int left = 0;
        int right = array.length;
        int mid;
        int index = -1;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid;
            } else {
                index = mid;
                break;
            }
        }
        if (index == -1) return 0;
        int count = 0;
        int t1 = index;
        int t2 = index + 1;
        while (t1 >= 0 && array[t1] == k) {
            count++;
            t1--;
        }
        while (t2 < array.length && array[t2] == k) {
            count++;
            t2++;
        }
        return count;
    }
}
