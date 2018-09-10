package biao.net;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Write implements Runnable {
    public Socket socket;
    public Write(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        Scanner scanner=null;
        PrintWriter writer=null;
        try{
            scanner=new Scanner(System.in);
            writer=new PrintWriter(socket.getOutputStream());
            while (true){
                String s=scanner.nextLine();
                writer.println(s);
                writer.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(scanner!=null) scanner.close();
                if(writer!=null) writer.close();
            }catch (Exception ex){

            }
        }
    }
}
