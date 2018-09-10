package biao.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo1 {
    public static void main(String[] args) {
        Class str="hello".getClass();
        try {
            String s=(String) str.newInstance();
            String[] strings=new String[10];
            Class c1=strings.getClass();
            System.out.println(c1.getName());
            Class cs=java.util.Vector.class.getSuperclass();
            System.out.println(cs);
            Class dou=Double.TYPE;
            System.out.println(dou.getName());
            System.out.println(cs.getClasses());
            Class ex=Class.forName("java.lang.String");
            Method[] methods=ex.getMethods();
            for (Method m:methods){
                StringBuffer sb=new StringBuffer();
                sb.append(Modifier.toString(m.getModifiers()));
            }
            Field[] field=ex.getDeclaredFields();
            for (Field f:field){
                System.out.println(Modifier.toString(f.getModifiers()));
                System.out.println(f.getType().getSimpleName());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
