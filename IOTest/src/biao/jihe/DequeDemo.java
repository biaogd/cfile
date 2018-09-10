package biao.jihe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.offer("hello");
        list.offer("world");
        list.offer("offer");
        list.offer("list");

        list.poll();
        list.addLast("hello");
        System.out.println(list);
        Deque<Integer> deque=new ArrayDeque<>();

    }
}
