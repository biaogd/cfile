package biao.lambda;

public class LambdaDemo {
    void execute(Lamd lamd){
        lamd.abanda("execute", 22);
    }
    public static void main(String[] args) {
//        Runnable r=()-> System.out.println("hello world");
//        Lamd lamd=new Lamd() {
//            @Override
//            public String abanda() {
//                System.out.println("this is the method abanda in Lamd");
//                return "";
//            }
//        };
//        lamd.abanda();
        new Thread(()-> System.out.println("this is a Thread use Lambda")).start();
        Lamd lamd=(name,age)->{
            System.out.println("use lambda chieve the interface"+" name: "+name+" age:"+age);
            return "";
        };
        lamd.abanda("tcp",23);
        new LambdaDemo().execute((name,age)->{ System.out.println("this is the execute method is run"+" name: "+name+" age:"+age);
            return "";});
    }
}
