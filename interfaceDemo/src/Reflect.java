import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 *  类的反射：
 *      obj.getClass()
 *      Class.forName("ClassName")
 *      obj.class
 *
 *
 *
 *  标注
 * @Override
 * @Deprecated
 * @SuppressWarning
 *
 *
 */
public class Reflect {




    public static void main(String[] args) {
        Reflect r = new Reflect();
        Class c = r.getClass();

        System.out.print(c);

//        Class d = Class.forName("Reflect");
//        System.out.print(d);

        Class d = Reflect.class;
        if (d == c) {
            System.out.print("ok");
        }

        String s = new String(new StringBuffer("1111111"));
//        Constructor sC =  s.getClass().getConstructor(StringBuffer.class);

    }


}
