package biao.net;

import java.net.DatagramSocket;

public class TUdpServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(1111);
            System.out.println("服务器已启动，等待客户端连接.....");
            new Thread(new UDPWrite(socket,2222)).start();
            new Thread(new UDPRead(socket)).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
