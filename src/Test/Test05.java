package Test;

public class Test05 {
    public static void main(String[] args) {
        char[] C = {'D', 'C', 'B', 'A', 'D'};
        char[] Z = {'A', 'D', 'B', 'C', 'D'};
        char[] B = {'A', 'D', 'B', 'C', 'A'};
        char[] K = {'A', 'B', 'C', 'D', 'D'};
        int c = zongFeng(C);
        int z = zongFeng(Z);
        int b = zongFeng(B);
        int k = zongFeng(K);
        System.out.println("满分10分,小传:得分:" + c + "分");
        System.out.println("满分10分,小智:得分:" + z + "分");
        System.out.println("满分10分,小播:得分:" + b + "分");
        System.out.println("满分10分,小客:得分:" + k + "分");
    }

    public static int zongFeng(char[] c) {
        char[] ch = {'A', 'D', 'B', 'C', 'D'};
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ch[i]) {
                count += 2;
            }
        }
        return count;
    }
}
