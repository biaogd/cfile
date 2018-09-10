package biao.net;

import java.net.Socket;

public class AdminClient implements Runnable {
    public Socket socket;
    public AdminClient(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(3000);
                socket.sendUrgentData(0xFF);
            }catch (Exception e){
                System.out.println("服务器异常，无法连接到服务器 !");
                break;

            }
        }

    }
}
