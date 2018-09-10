package biao.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo implements Runnable {
    private int money;
    public ThreadDemo(int money){
        this.money=money;
    }
    public final ReentrantLock lock=new ReentrantLock();
    Condition condition=lock.newCondition();
    @Override
    public void run() {
        try {
            while (money >= 300) {

                    lock.lock();
                    condition.await();
                    System.out.println(Thread.currentThread().getName() + "取钱300,剩余:" + money);
                    money -= 300;
                    lock.unlock();
                Thread.sleep(10);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("main Thread start...");
    ThreadDemo demo=new ThreadDemo(9000);
    Thread t1=new Thread(demo,"user 1");
    Thread t2=new Thread(demo,"user 2");
    Thread t3=new Thread(demo,"user 3");
    try{
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }catch (Exception e){

    }
        System.out.println("main Thread end...");
    }
}
