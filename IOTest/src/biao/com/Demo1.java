package biao.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        seriaDemo demo=new seriaDemo();
        demo.fname="hello";
        demo.fsize=1024;
        demo.fdir="/home/biao/hello";
        demo.user="biao";
        ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("/home/biao/seriaDemo.ser"));
        stream.writeObject(demo);
        stream.close();
        System.out.println("Serialized data is saved in /home/biao/seriaDemo.ser");

    }
}
