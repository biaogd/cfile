package biao.thread;

public class Join extends Thread {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"线程正在执行"+i);
        }
    }

    public static void main(String[] args) {
        Thread t=new Join();
        t.start();
        System.out.println("main线程开始执行");
        for (int j=0;j<5;j++){
            if(j>2){
                try{
                    t.join();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("main线程正在运行中："+j);
        }
        System.out.println("main线程执行完毕");
    }
}
