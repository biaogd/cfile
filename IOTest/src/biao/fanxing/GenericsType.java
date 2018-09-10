package biao.fanxing;

public class GenericsType<T> {
//    private Object t;
//    public Object get(){
//        return t;
//    }
//    public void set(Object t){
//        this.t=t;
//    }
//
//    public static void main(String[] args) {
//        GenericsType type=new GenericsType();
//        type.set(123);
//        String str=(String)type.get();
//        System.out.println(str);
//    }
    private T t;
    public T get(){return this.t;}
    public void set(T t){this.t=t;}

    public static void main(String[] args) {
        GenericsType<Integer> type=new GenericsType<Integer>();
        type.set(666);
        GenericsType type1=new GenericsType();
        type1.set("sfds");
        type1.set(123);

    }
}
