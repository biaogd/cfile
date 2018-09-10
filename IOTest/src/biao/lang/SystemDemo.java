package biao.lang;


public class SystemDemo {
    public static void main(String[] args) throws java.io.IOException{
        int[] one={1,2,3,4,5};
        int[] two={6,7,8,9,0};
        System.arraycopy(one, 0, two, 0, 2);
        for(int x:two){
            System.out.println(x);
        }
        long startTime=System.currentTimeMillis();
        for(int i=0;i<999999999;i++){

        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.getProperties().list(System.out);
    }
}
