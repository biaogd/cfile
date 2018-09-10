package biao.net.file;

import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpFileServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(1111);
            byte[] buf = new byte[1024];
            DatagramPacket packet = null;
            String s=null;
            File file=new File("/home/biao/nuget1.exe");
            if(!file.exists()){
                file.createNewFile();
            }
            int i=0;
            FileOutputStream outputStream=new FileOutputStream(file);
            while (true){
                packet=new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                byte[] bytes=new byte[8];
                bytes=new String("socket").getBytes();
                DatagramPacket packet1=new DatagramPacket(bytes , bytes.length, InetAddress.getLocalHost(),2222);
                socket.send(packet1);
                i++;
                s=new String(packet.getData(),0,packet.getLength());
                if(s.equals("end")){
                    System.out.println("文件接收完成");
                    break;
                }else{
                    outputStream.write(packet.getData(), 0, packet.getLength());

                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
