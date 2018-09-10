package biao.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Read implements Runnable {
    public Socket socket;
    public Read(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        BufferedReader reader=null;
        String s=null;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((s=reader.readLine())!=null){
                System.out.println(s);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(reader!=null) {
                try{
                    reader.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
