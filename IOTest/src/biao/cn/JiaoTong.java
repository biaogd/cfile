package biao.cn;

public abstract class JiaoTong {
    public JiaoTong(int pNum,int hNum){
        this.pNum=pNum;
        this.hNum=hNum;
    }
    public int pNum;
    public int hNum;
    public abstract String fuzai();
}
