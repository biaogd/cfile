package biao.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket=null;
        byte[] buffer=new byte[1024];
        try{
            socket=new DatagramSocket(1111);

            DatagramPacket packet=new DatagramPacket(buffer, buffer.length);
            System.out.println("等待消息的到来...");
            socket.receive(packet);
            String s=new String(packet.getData(), 0,packet.getLength());
            System.out.println(s);
        }catch (Exception e){

        }
    }
}
