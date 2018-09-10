package biao.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPWrite implements Runnable {
    private  DatagramSocket socket;
    private int port;
    public UDPWrite(DatagramSocket socket,int port){
        this.socket=socket;
        this.port=port;
    }

    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        byte[] buffer=new byte[1024];

        try{
            DatagramPacket packet=null;
            while (true){
                buffer=new String(scanner.nextLine()).getBytes();
                packet=new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), port);
                socket.send(packet);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
