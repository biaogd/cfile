package biao.net;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1111);
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("hello world");
            writer.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
