package biao.cn;

public class Initial {
    public static void main(String[] args) {
        JiaoTong j1=new Car(5,0);
        JiaoTong j2=new Plane(100,20);
        System.out.println(j1.fuzai());
        System.out.println(j2.fuzai());
    }
}
