package Demo;

/*
使用动态初始化数组的时候,其中的元素将会自动拥有一个默认值.规则如下:
如果是整数类型,那么默认为0;
如果是浮点类型,那么默认为0.0;
如果是字符类型,那么默认为'\u0000';\|
 */
public class Demo_5 {
    public static void main(String[] args) {
//        动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
