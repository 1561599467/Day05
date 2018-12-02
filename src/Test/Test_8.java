package Test;
/*
* 数组{2,4,2,5,6,8,7,8,4,5}
* 将其中数字出现的次数打印出来
* */
public class Test_8 {
    public static void main(String[] args) {
        char[] c={'B','C','D','B'};
        printCount(c);
    }
    public static void printCount(char[]c){
        int[] b=new int[26];
        for (int i = 0; i < c.length; i++) {
            int d=c[i];
            b[d-65]++;
        }
        for (int i = 0,ch1=65; i < b.length; i++,ch1++) {
            if (b[i] != 0) {
                System.out.println((char)ch1+"--"+b[i]);
            }
        }
    }
}
