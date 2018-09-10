package biao.jihe;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("c#");
        list.add("python");
       Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Object[] objects=list.toArray();
        String[] strings=new String[objects.length];
        for (int i=0;i<objects.length;i++){
            strings[i]=(String)objects[i];
        }
        for (String s:strings){
            System.out.println(s);
        }
        System.out.println(list.contains("java"));
        System.out.println(list.indexOf("c#"));
        System.out.println(list.get(0));
        Collections.sort(list);
        System.out.println();
    }
}
