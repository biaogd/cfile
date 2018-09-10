package biao.thread;

public class WaitDemo{

public synchronized void fun(){
    try {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                wait();
            }
            System.out.println(Thread.currentThread().getName()+"is running :"+i);
        }
    }catch (Exception e){
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
    WaitDemo demo=new WaitDemo();
        new Thread(){
            @Override
            public void run() {
                demo.fun();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (demo){
                    System.out.println(Thread.currentThread().getName()+" start run...");
                    demo.notify();
                    System.out.println(Thread.currentThread().getName()+" end run ...");
                }
            }
        }.start();
    }
}
