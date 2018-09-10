package biao.net.file;

import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpFileClient {
    public static void main(String[] args) {
        try{
            DatagramSocket socket=new DatagramSocket(2222);
            DatagramPacket packet=null;
            byte[] buff=new byte[1024];
            File file=new File("/home/biao/nuget.exe");
            FileInputStream inputStream=new FileInputStream(file);
            int i=0;
            while (inputStream.read(buff)!=-1){
                packet=new DatagramPacket(buff, buff.length, InetAddress.getByName("www.mybiao.top"),6666);
                socket.send(packet);
                DatagramPacket packet1=new DatagramPacket(buff, buff.length);
                while (true) {
                    try {
                        socket.setSoTimeout(2000);
                        socket.receive(packet1);
                        break;
                    } catch (Exception se) {
                        System.out.println(se.getMessage());
                        socket.send(packet);
                        System.out.println("find a error");
                    }
                }

            }
            buff=new String("end").getBytes();
            packet=new DatagramPacket(buff, buff.length,InetAddress.getLocalHost(),6666);
            socket.send(packet);
            socket.close();
            inputStream.close();
            System.out.println("文件发送完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
