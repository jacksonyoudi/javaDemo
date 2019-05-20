public class Child extends Base {

    /**
     * 先加载父类
     * 类初始化代码是先加载父类的，然后再执行子类的
     *
     *   栈，堆，方法区
     *
     *
     */

    public static int s;

    private int a;

    static {
        System.out.println("子类静态代码块, s: " + s);
        s = 10;
    }

    {
        System.out.println("子类实例代码块， a: " + a);
        a = 10;
    }

    public Child() {
        System.out.println("子类构造方法, a: " + a);
        a = 20;
    }

    protected void step() {
        System.out.println("child s: " + s + " + a:" + a);
    }


    public static void main(String[] args) {
        System.out.println("-----new child()");
        Child c = new Child();
        // 1. 分配内存 2. 对所有的实例化变量赋值默认值 3. 执行实例初始化代码

        System.out.println("\n---c.action()");
        c.action();

        Base b = c;
        System.out.println("\n---b.action()");

        b.action();

        System.out.println("\n----b.s:" + b.s);
        System.out.println("\n----c.s:" + c.s);
    }
}
