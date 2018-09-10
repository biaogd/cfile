package biao.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRead implements Runnable {
    private DatagramSocket socket;
    public UDPRead(DatagramSocket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        byte[] buffer=new byte[1024];
        DatagramPacket packet=null;
        while (true){
            try {
                packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String s = new String(packet.getData(),0,packet.getLength());
                System.out.println(s);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
