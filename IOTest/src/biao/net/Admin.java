package biao.net;

import java.net.Socket;

public class Admin implements Runnable {
    public Socket socket;
    public static int n;
    public Admin(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        n++;
        System.out.println("用户[Port:"+socket.getPort()+"]连接，当前在线人数："+(++ThreadServer.num));
        while (true){
            try{
                Thread.sleep(3000);
                socket.sendUrgentData(0xFF);
            }catch (Exception e){
                n--;
                System.out.println("用户[Port"+socket.getPort()+"]断开，当前在线人数："+(--ThreadServer.num));
                break;
            }
        }
    }
}
