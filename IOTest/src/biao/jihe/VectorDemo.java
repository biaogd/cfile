package biao.jihe;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("asp.net");
        vector.add(".net core");
        vector.add("java");
        vector.add("node.js");
        vector.add("python");
        Enumeration<String> en=vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
