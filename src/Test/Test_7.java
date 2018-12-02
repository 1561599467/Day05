package Test;

public class Test_7 {
    public static void main(String[] args) {
        char[] ch = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        printCount(ch);
    }

    public static void printCount(char[] ch) {
        //建立一个数组,保存字母出现的次数
        int[] count = new int[26];
        //遍历ch数组,定义一个int变量,表示数组中出现过相应字母的次数
        for (int i = 0; i < ch.length; i++) {
            int c = ch[i];//  int c=ch[i]=a=97....
            //用变量int c来表示数组int[]count的索引
            //a=97,索引从0开始,int[]count第一个索引可以用(a-97)来表示
            //数组ch每出现一次,int[]count累计一次相应索引的元素
            //如果出现b一次,也就是count[b-97]++ = count[1]++
            //如果出现b两次,count[1]++再++,初始值为0,现值为2.
            count[c - 97]++;//count[a-97]=count[0]=a
        }
        //int[]count中的内容已经改变
        //遍历int[]count,将其中不为0的数字(也就是出现过的字母)打印出来
        for (int i = 0, ch1 = 97; i < count.length; i++, ch1++) {
            if (count[i] != 0) {
                System.out.println((char) ch1 + "--" + count[i]);
            }
        }
    }
}
