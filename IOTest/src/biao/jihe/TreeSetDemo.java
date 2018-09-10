package biao.jihe;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    enum en{
        FIRST,SECOND,THIRED
    }
    public static void main(String[] args) {
        Student s1=new Student(100, "aaa", 23);
        Student s2=new Student(101, "bbb", 22);
        Student s3=new Student(37, "ccc", 44);
        Student s4=new Student(11, "ddd", 33);
        TreeSet<Student> set=new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        Iterator<Student> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().no);
        }
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("/home/biao/hello");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(new Student(123456, "join", 22));
            System.out.println("序列化完成");
        }catch (Exception e){
            e.printStackTrace();
        }
        Day day=Day.ONE;
    }

}
