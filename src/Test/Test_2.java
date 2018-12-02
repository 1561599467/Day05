package Test;

public class Test_2 {
    public static void main(String[] args) {
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int average = average(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("高于平均分" + average + "的 个数有" + count + "个");
    }

    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = (int) sum / arr.length;
        return average;
    }
}
