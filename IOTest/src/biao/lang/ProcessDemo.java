package biao.lang;

public class ProcessDemo {
    public static void main(String[] args) {
        try{
//            Process process=Runtime.getRuntime().exec("gedit");
           ProcessBuilder builder=new ProcessBuilder("gedit");
           builder.start();
            System.out.println(builder.directory().getAbsolutePath());
        }catch (Exception e){

        }
    }
}
