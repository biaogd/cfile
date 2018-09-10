package biao.jihe;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
       stack.push("hello");
        stack.push("world");
        System.out.println(stack.capacity());
        Stack<String> s=new Stack<>();
        s.add("abstract");
        s.add("final");
        stack.addAll(1,s);
        System.out.println(stack.peek());
        System.out.println(stack.get(0));
        System.out.println(stack.contains("hello"));
    }
}
