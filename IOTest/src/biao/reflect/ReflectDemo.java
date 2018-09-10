package biao.reflect;

import java.io.Console;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;

public class ReflectDemo {
    public static void main(String[] args) {
        try {
          Class obj=Class.forName("java.lang.Object");
          Object object=obj.newInstance();

            Constructor[] constructors=obj.getConstructors();
            System.out.println(obj.getName());
            for(Constructor c:constructors)
            System.out.println(c);
            System.out.println("java.lang.String类的方法有：");
            Method[] methods=obj.getMethods();
            for (Method m:methods){
                System.out.println(m);
            }


            Class[] css=obj.getClasses();
            System.out.println(css.length);

        }catch (Exception e){
        e.printStackTrace();
        }
    }
}
