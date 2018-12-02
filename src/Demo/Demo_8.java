package Demo;

public class Demo_8 {
    public static void main(String[] args) {
        int[] arr = {11, 34, 54, 35, 64, 27, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值:" + max);
    }
}
