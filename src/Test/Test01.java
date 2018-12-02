package Test;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > getAvg(arr)) {
                count++;
            }
        }
        System.out.println("高于平均分:" + getAvg(arr) + "的个数有" + count + "个");
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }
}
