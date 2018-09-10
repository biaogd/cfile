package biao.cn;

public class Plane  extends JiaoTong {
    public Plane(int p,int h){
        super(p,h);
    }
    @Override
    public String fuzai() {
        return "载货："+this.hNum+";载人:"+this.pNum;
    }
}
