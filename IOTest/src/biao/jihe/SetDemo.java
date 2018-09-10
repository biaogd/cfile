package biao.jihe;


import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        System.out.println(set.add(22));
        System.out.println(set.add(22));
        List<Integer> list=new ArrayList<>();
        list.add(111);
        list.add(122);
        list.add(22);
        list.add(66);
        System.out.println(set.addAll(list));
        System.out.println(set);
       TreeSet<Integer> treeSet=new TreeSet<>(set);
        System.out.println(treeSet);
    }
}
