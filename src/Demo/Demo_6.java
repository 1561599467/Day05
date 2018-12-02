package Demo;

public class Demo_6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 23, 5, 4, 65, 7, 68};
        int sum = sumArray(arr);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
