package Test;

public class Test03 {
    public static void main(String[] args) {
        String[] hs = {"♠", "♥", "♣", "♦" };
        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        poker(hs,ds);
    }

    public static void poker(String[] hs, String[] ds) {
        String[] poker = new String[hs.length*ds.length];
        int count=0;
        for (int i = 0; i < hs.length; i++) {
            for (int i1 = 0; i1 < ds.length; i1++) {
                poker[count]=hs[i]+ds[i1];
                System.out.print(poker[count]+" ");
                count++;
            }
            System.out.println();
        }
    }
}
