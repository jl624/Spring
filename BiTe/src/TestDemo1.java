import java.util.Arrays;

/**
 * @program: BiTe
 * @description:
 *
 * @author: JINLEI
 * @data: 2021/3/5
 * @time: 10:29
 */
public class TestDemo1 {


    //一个数组中只有一个数字出现了一次，其他数字都是两次，找出这个出现一次的数字
    public static void main(String[] args) {

        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }


    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main3(String[] args) {
        int[][] arr = new int[2][];
        //C 语言可以指定列  行可以自动推导
        //Java 行必须指定 列不可以自动推导
        arr[0] = new int[]{1,3,4};
        arr[1] = new int[]{5,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
        System.out.println(Arrays.deepToString(arr));

    /**
     * 二维数组的打印方式
     * @param args
     */
    /*public static void main2(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};

        for (int[] tmp: arr) {
            for (int x : tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        /*System.out.println(Arrays.toString(arr));//[[I@1b6d3586, [I@4554617c] 此时arr 里是数组的地址
        System.out.println(Arrays.deepToString(arr));*///deepToString()=>[[1, 2, 3], [4, 5, 6]] 打印二维数组

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
    }

    /**
     * 二维数组的定义
     * @param args
     */
    public static void main1(String[] args) {

        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][] {{1,3,4},{1,3,45}};
        int[][] array3 = new int[2][3];
    }
}
