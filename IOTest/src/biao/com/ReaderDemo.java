package biao.com;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
//            FileReader fileReader = new FileReader("/home/biao/abc.cpp");
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String s=null;
//            while((s=bufferedReader.readLine())!=null){
//                System.out.println(s);
//            }
//            BufferedWriter writer=new BufferedWriter(new FileWriter("/home/biao/abc.cpp"));
//            writer.write("hello world");
//            writer.close();
            PrintStream out=new PrintStream(new File("/home/biao/abc.cpp"));
            out.print("hellon world");
            out.print("this is print");
            FileReader fileReader = new FileReader("/home/biao/abc.cpp");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String s=null;
            while((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
