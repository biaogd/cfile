package biao.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    public Socket socket=null;
    public Server(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {

    }
}
