package Test;

public class Test06 {
    public static void main(String[] args) {
        char[] ch={'a','l','f','m','f','o','b','b','s','n'};
        printCount(ch);
    }
    public static void printCount(char[] ch){
        int[] a=new int[26];
        for (int i = 0; i < ch.length; i++) {
            int c=ch[i];
            a[c-97]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0) {
                System.out.println((char)(i+97)+"--"+a[i]);
            }
        }
    }
}
