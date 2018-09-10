package biao.fanxing;


import java.util.ArrayList;
import java.util.List;

public class Demo1{
    public static <T> void printList(List<T> list){
        for (T t:list){
            System.out.println(t);
        }
    }
    public static void fun(List<? extends String> ll){
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("hello");
        l1.add("world");
        new Demo1().printList(l1);
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(6);
        new Demo1().printList(l2);
    }
}
