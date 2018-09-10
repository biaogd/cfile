package biao.com;

public class GetNum {
    public int a;
    public GetNum(int a){
        this.a=a;
    }
    public int GetA() throws MyException{
        if (a<0) throw new MyException("a小于0,不合法\n");
        return a;
    }

    public static void main(String[] args){
        GetNum gt=new GetNum(-10);
        try {
            gt.GetA();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
