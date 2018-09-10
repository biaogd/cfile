package biao.com;

import java.io.*;
import java.util.Scanner;

public class FseriaDemo {
    public static void main(String[] args) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/biao/seriaDemo.ser"));
            seriaDemo obj = (seriaDemo)in.readObject();
            System.out.println(obj.getDirect());
            FileOutputStream out=new FileOutputStream("/home/biao/hello");
            Scanner scanner=new Scanner(System.in);
            if(scanner.hasNext()){
                String s=scanner.nextLine();
                byte[] bytes=s.getBytes();
                out.write(bytes);
            }
            scanner.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
