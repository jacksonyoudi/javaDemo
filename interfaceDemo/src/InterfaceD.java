/**
 * 具体的类，所有接口都必须实现
 * 抽象类，可以实现部分
 * 抽象类 可以继承，如果子类没有实现所有的抽象方法，那子类也是抽象类
 * 抽象类和抽象方法都是使用 abstract关键字
 *  只要有一个抽象方法的类就是抽象类,抽象类不能实例化， 可以指向具体的类
 *
 *
 *  接口内不能有实例变量，只能有静态变量，抽象类可以拥有实例变量
 *  接口内的方法，默认是 public, 抽象类的方法必须手动声明访问控制符
 */

abstract class AB {
    abstract void print();
}



public class InterfaceD implements schoolT {
    @Override
    public void printName() {
        System.out.print("xixi");
    }

    @Override
    public void getName() {
        System.out.print("hello");
    }

    public static void main(String[] args) {
        schoolT sc = new InterfaceD();
        sc.getName();
        schoolT scT = new InterfaceD();
        scT.getName();
        scT.printName();
    }
}


// 接口的继承
interface school {
    void printName();
}


interface schoolT extends school {
    void getName();
}



