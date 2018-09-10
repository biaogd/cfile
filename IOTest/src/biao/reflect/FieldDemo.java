package biao.reflect;

import biao.jihe.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class FieldDemo {
    public void asp(String name,int... no){
        System.out.println(no.length);
        for(int x:no){
            System.out.print(x);
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        Class cs=String.class;
        Field[] fields=cs.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f.getType());

        }
        Student s=new Student(123, "hello", 22);
        Class c=s.getClass();
        Field no=c.getDeclaredField("no");
        no.setInt(s, 234);          //通过反射修改s对象的字段的值
        System.out.println("the no is :"+s.no);
        Class stu=Student.class;
        Method method=stu.getMethod("print",String.class);
        method.invoke(stu,"hello");
        new FieldDemo().asp("ppp", 1,2,3,4,5);
        Constructor[] con=cs.getConstructors();
        for (Constructor ccc:con){
            System.out.println(Modifier.toString(ccc.getModifiers()));
        }
    }
}
