import javax.naming.Name;

/**
 * @program: BiTe
 * @description:
 *      封装：用private来修饰属性 或者方法
 *      为什么需要封装？
 *
 *      this: 当前对象的 引用
 * @author: JINLEI
 * @data: 2021/3/5
 * @time: 15:56
 */

class Student{

    private String name;
    private int age;

    //提供一个公开的接口

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

    public void func1(){
        System.out.println("func1()");
    }
    public void show(){
        System.out.println("我叫"+this.name+",今年"+this.age+"岁");
    }

    //重新 实现了Object类的toStirng()方法
    //Object  是所有类的父类
    @Override//注解：指的是这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("gaobo");
        //System.out.println(student.getName());
        System.out.println(student);
    }
}
