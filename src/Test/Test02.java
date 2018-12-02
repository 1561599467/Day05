package Test;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        boolean b1 = sym(arr1);
        System.out.println(Arrays.toString(arr1)+"是否对称:"+b1);
        int[] arr2 = {1, 2, 3, 4, 5, 2, 1};
        boolean b2 = sym(arr2);
        System.out.println(Arrays.toString(arr2)+"是否对称:"+b2);
    }

    public static boolean sym(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            if (arr[start] != arr[end]) {
                return false;
            }
        }
        return true;
    }
}
