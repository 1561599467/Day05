package Test;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Test_6 {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'D', 'B', 'C', 'D'};
        char[] xC = {'D', 'C', 'B', 'A', 'D'};
        char[] xZ = {'A', 'D', 'B', 'C', 'D'};
        char[] xB = {'A', 'D', 'B', 'C', 'A'};
        char[] xK = {'A', 'B', 'C', 'D', 'D'};
        int zhong = deFen(ch1, ch1);
        int C = deFen(xC, ch1);
        int Z = deFen(xZ, ch1);
        int B = deFen(xB, ch1);
        int K = deFen(xK, ch1);
        System.out.println("满分" + zhong + "分,小传:得分:" + C + "分");
        System.out.println("满分" + zhong + "分,小智:得分:" + Z + "分");
        System.out.println("满分" + zhong + "分,小播:得分:" + B + "分");
        System.out.println("满分" + zhong + "分,小客:得分:" + K + "分");
    }

    public static int deFen(char[] ch, char[] ch1) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (ch[i] == ch1[i]) {
                sum += 2;
            }
        }
        return sum;
    }
}
