package biao.jihe.map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("biao", "22");
        map.put("who", "biao");
        map.put(null, null);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.get("biao"));
        Set entry=map.entrySet();
        if(entry!=null){
            Iterator it=entry.iterator();
            while (it.hasNext()){
                Map.Entry en=(Map.Entry)it.next();
                System.out.println(en.getKey()+" "+en.getValue());
            }
        }
        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.put("this", "there");
        treeMap.put("base", "abstract");
        System.out.println(treeMap.put("score", "plus"));
        System.out.println(treeMap.put("this", "asp.net"));
        System.out.println(treeMap);
        System.out.println(treeMap.get("score"));
    }
}
