package biao.net;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class NetDemo {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://img0.imgtn.bdimg.com/it/u=82980681,121754374&fm=27&gp=0.jpg");
        System.out.println(url.getProtocol()); //获得URL的协议标识符组件
        System.out.println(url.getAuthority());//获得URL的权限组件
        System.out.println(url.getHost());      //获得组件名组件
        System.out.println(url.getPort());      //获得主机端口号
        System.out.println(url.getPath());      //获得此URL的路径组件
        System.out.println(url.getQuery());     //获得此URL的查询组件
        System.out.println(url.getFile());      //获得此URL的文件名组件
        System.out.println(url.getRef());       //获得URL的引用组件
        URLConnection connection=url.openConnection();
        HttpURLConnection http=null;
        if(connection instanceof HttpURLConnection){
            http=(HttpURLConnection)connection;
        }else{
            System.out.println("URL is error");
            System.exit(0);
        }
        File f=new File("/home/biao/ahut.jpg");
        if(!f.exists()){
            f.createNewFile();
        }
        byte[] bytes=new byte[1024];
        InputStream stream=http.getInputStream();
        FileOutputStream out=new FileOutputStream(f);
        while (stream.read(bytes)!=-1){
            out.write(bytes);
        }
        System.out.println("文件已保存到/home/biao/ahut.jpg");

    }
}
