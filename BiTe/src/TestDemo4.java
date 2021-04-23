import java.util.Arrays;

/**
 * @program: BiTe
 * @description: 类和对象
 *      构造方法：方法名和类名相同，且没有返回值(可以进行重载)
 *      作用：构造对象
 *      一个对象的产生分为几步，如何产生？
 *      1、为对象分配内存
 *      2、调用合适的构造方法
 *      this:
 *      this():调用自己的构造方法
 *      this.data:调用当前对象的属性
 *      this.func():调用当前对象的方法
 *      注意：
 *          只能在构造方法里面写
 *          只能调用一次
 *          只能写在第一行
 *       静态的东西和他们定义的顺序有关，静态的内容只会被执行一次，且是最早被执行的。
 * @author: JINLEI
 * @data: 2021/3/5
 * @time: 19:52
 */
class Person1{
    private String name;
    private int age;
    public static int count;


    public Person1() {
        this("caocao",18);
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    {
        System.out.println("实例代码块");
    }

    static {
        //this.name = "zhangfei";//不能访问非静态的数据成员
        //count = 99;
        System.out.println("静态代码块");
    }
}

//计算器
class Calculator{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return this.num1 + this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public double dev(){
        return this.num1*1.0/this.num2;
    }
}
class myVal{
    //private int val;
    public int val;
    /*public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }*/
}

public class TestDemo4 {

    //交换两个整数
    public static void swap(myVal myval1,myVal myval2){
        int tmp = myval1.val;
        myval1.val = myval2.val;
        myval2.val = tmp;
    }

    public static void main(String[] args) {
        myVal val1 = new myVal();
        val1.val = 10;

        myVal val2 = new myVal();
        val2.val = 20;
        System.out.println(val1.val);
        System.out.println(val2.val);
        System.out.println("开始交换：");
        swap(val1,val2);

        System.out.println(val1.val);
        System.out.println(val2.val);

    }

    /*public static void swap(myVal myval1,myVal myval2){
        int tmp = myval1.getVal();
        myval1.setVal(myval2.getVal());
        myval2.setVal(tmp);
    }
    public static void main(String[] args) {
        myVal val1 = new myVal();
        val1.setVal(10);

        myVal val2 = new myVal();
        val2.setVal(20);

        System.out.println(val1.getVal());
        System.out.println(val2.getVal());
        System.out.println("开始交换：");
        swap(val1,val2);

        System.out.println(val1.getVal());
        System.out.println(val2.getVal());


    }*/
    public static void main4(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("加法");
        System.out.println(calculator.add());
        System.out.println("减法");
        System.out.println(calculator.sub());
        System.out.println("乘法");
        System.out.println(calculator.mul());
        System.out.println("除法");
        System.out.println(calculator.dev());
    }
    //长度相同的两个数组交换
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = {12,23,34,45,56,67};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main2(String[] args) {
        Person1 person1 = new Person1();
        new Person1().getName();//匿名对象
    }
    public static void main1(String[] args) {

        Person1 person1 = new Person1();
    }

}
