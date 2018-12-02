package Test;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,3,2,1};
        boolean b=equals(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("是否一致:"+b);
    }
    public static boolean equals(int[] arr1,int[] arr2){
        if (arr1.length!=arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
