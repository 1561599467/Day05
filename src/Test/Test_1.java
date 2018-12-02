package Test;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println("您的大乐透号码为:");
        int[] arr={10,20,30,40,50,60,66,70,80,90};
        daLeTou(arr);
    }
    public static void daLeTou(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
