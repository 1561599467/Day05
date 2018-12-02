package Test;

public class Test_5 {
    public static void main(String[] args) {
        String[] str = {"黑桃", "红桃", "梅花", "方片"};
        String[] str2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                // poker[count++]=str[i]+str2[j];
                System.out.print(str[i] + str2[j] + " ");
            }
            System.out.println();
        }
    }
}
