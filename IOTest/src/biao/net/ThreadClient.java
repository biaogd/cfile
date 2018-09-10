package biao.net;

import java.net.Socket;

public class ThreadClient {
    public static void main(String[] args) {
        Socket socket=null;
        try{
            socket=new Socket("www.mybiao.top",1111);
                new Thread(new AdminClient(socket)).start();
                new Thread(new Write(socket)).start();
                new Thread(new Read(socket)).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
