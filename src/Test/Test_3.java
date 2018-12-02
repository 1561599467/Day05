package Test;

public class Test_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 2, 1};
        shuZu(arr);
        System.out.println("是否对称:" + sym(arr));
        shuZu(arr2);
        System.out.println("是否对称:" + sym(arr2));
    }

    public static void shuZu(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < 7; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
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
