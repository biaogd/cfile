package biao.cn;

public class Car extends JiaoTong {
    public Car(int pNum,int hNum){
        super(pNum,hNum);
    }
    @Override
    public String fuzai() {
        return "载货："+this.hNum+";载人:"+pNum;
    }
}
