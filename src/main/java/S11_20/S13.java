package Algorithm.SwordForOffer.S11_20;

import LeetCode.PublicClass.Utils;

/**
 * Created by Elvis on 2019/12/20.
 */
public class S13 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 34, 6, 1, 4, 7, 2, 7, 12};
        reOrderArray(arr);
        Utils.printIntArrays(arr);
    }

    public static void reOrderArray(int [] array) {
    	int[] newArr = new int[array.length];
    	int index = 0;
    	for (int i = 0; i < array.length; i++) {
    		if ((array[i] & 1) == 1) {
    			newArr[index++] = array[i];
    		}
    	}
    	for (int i = 0; i < array.length; i++) {
    		if ((array[i] & 1) == 0) {
    			newArr[index++] = array[i];
    		}
    	}
    	for (int i = 0; i < array.length; i++) {
    		array[i] = newArr[i];
     	}
    }

    public static void reOrderArray1(int [] array) {
    	int pre = -1;
    	int suf = array.length;
    	int l = 0;
    	while (l < suf) {
    		if ((array[l] & 1) == 1) {
    			swap(array, ++pre, l++);
    		} else {
    			swap(array, --suf, l);
    		}
    	}
    }

    public static void swap(int[] arr, int i, int j) {
    	if (i == j) return;
    	arr[i] ^= arr[j];
    	arr[j] ^= arr[i];
    	arr[i] ^= arr[j];
    }
}
