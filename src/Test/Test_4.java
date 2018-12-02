package Test;

public class Test_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("是否一致:" + equals(arr, arr2));
    }

    public static boolean equals(int[] arr, int[] arr2) {

        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
