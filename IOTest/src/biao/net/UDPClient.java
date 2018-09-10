import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
            byte[] buffer=new String("hello world").getBytes();
        try {
            DatagramSocket socket=new DatagramSocket(1112);
            DatagramPacket packet=new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 1111);
            socket.send(packet);
            System.out.println("发送成功....");
        }catch (Exception e){

        }
    }
}
