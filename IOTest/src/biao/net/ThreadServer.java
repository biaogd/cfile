package biao.net;

import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServer {
    public  static volatile int num;
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(1111);
            System.out.println("服务器已启动.....");
            ThreadServer.num=0;
            while (true){
                Socket soc=socket.accept();
                new Thread(new Admin(soc)).start();
                new Thread(new Read(soc)).start();
                new Thread(new Write(soc)).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
        }
    }
}
