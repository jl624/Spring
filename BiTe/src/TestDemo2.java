/**
 * @program: BiTe
 * @description:
 * 访问修饰限定符：
 *      public：公有的
 *      private：私有的
 *      protected：受保护的
 *      什么都不加：默认权限
 * @author: JINLEI
 * @data: 2021/3/5
 * @time: 14:49
 */
class Person{

    //字段->成员变量  定义在方法外 类里面
    // 实例成员变量：对象里面
    //实例成员没有初始化 默认值为对应的0值 引用类型默认为null  简单类型默认为0
    //char默认为‘\u0000’  boolean默认为 false
    public String name;
    public int age;

    //静态成员变量 不属于对象  属于类 和实例成员变量 0
    public static int size;

    //方法->行为  实例成员方法
    public void eat(){

        int a = 10;//局部变量
        System.out.println("eat()");
    }

    public void sleep(){
        System.out.println("sleep()");
    }

    public static void fun(){
        System.out.println("static:fun()");
        //age = 99;//静态方法内部 不能访问非静态的数据成员
        size = 999;
    }
}
class Test{

    public  int a;
    public static int count;//只有一份，且在方法区
}
public class TestDemo2 {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);//1
        System.out.println(Test.count);//1

        System.out.println("======================");
        Test t2 = new Test();
        t2.a++;//1
        Test.count++;//2
        System.out.println(t2.a);//1
        System.out.println(Test.count);//2
    }

    public static void main4(String[] args) {
        Person person = new Person();
        person.eat();
        person.sleep();
    }
    public static void main3(String[] args) {

        //如何访问静态的成员变量  类名.静态成员变量
        System.out.println(Person.size);
    }
    public static void main2(String[] args) {

        Person person = new Person();

        //如何操作对象当中的实例化成员？
        //操作符：点号  对象的引用. 成员变量
        System.out.println(person.name);
        System.out.println(person.age);
    }

    public static void main1(String[] args) {

        //实例化一个对象 通过  关键字new
        Person person = new Person();
    }
}
