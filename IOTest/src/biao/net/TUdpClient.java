package biao.net;

import java.net.DatagramSocket;

public class TUdpClient {
    public static void main(String[] args) {
        try{
            DatagramSocket socket=new DatagramSocket(2222);
            new Thread(new UDPRead(socket)).start();
            new Thread(new UDPWrite(socket,1111)).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
