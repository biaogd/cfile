package biao.jihe;

import java.io.Serializable;

public class Student implements Comparable, Serializable {
    public int no;
    public String name;
    public int age;
    public Student(int no,String name,int age){
        this.no=no;
        this.name=name;
        this.age=age;

    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        return this.no-student.no;
    }
    public static void print(String as){
        System.out.println("from Class call the Student method"+as);
    }

}
