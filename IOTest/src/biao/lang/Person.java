package biao.lang;


import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name:"+this.name+",age:"+this.age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放->"+this);
    }

    public static void main(String[] args) {
        Person person = new Person("java", 23);
        person = null;
        System.gc();
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        try {
            Class c=loader.loadClass("biao.jihe.Student");
            Method method=c.getMethod("print", String.class);
            method.invoke(c, "hello,Student");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
