package biao.lang;


import java.io.*;

public class MathDemo {
    public static void main(String[] args) throws Exception{
        System.out.println(Math.floor(23.343));
        System.out.println(Math.ceil(23.343));
        FileInputStream fileInputStream=new FileInputStream("/home/biao/TestJNI.java");
        BufferedReader reader=new BufferedReader(new InputStreamReader(fileInputStream));
        //BufferedWriter writer=new BufferedWriter(new OutputStreamWriter());

    }
}
