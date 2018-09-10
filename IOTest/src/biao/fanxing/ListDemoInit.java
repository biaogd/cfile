package biao.fanxing;

import java.util.ArrayList;
import java.util.List;

public class ListDemoInit<E> implements ListDemo<E> {
    private List<E> list;
    public ListDemoInit(){
        list=new ArrayList<>();
    }
    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public E getValue(int i) {
        return list.get(i);
    }

    public static void main(String[] args) {
        ListDemoInit<String> init=new ListDemoInit<>();
        init.add("hello world");
        init.add("this is a good man");
        System.out.println(init.getValue(0));
        System.out.println(init.getValue(1));
    }
}
