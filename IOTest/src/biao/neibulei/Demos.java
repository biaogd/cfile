package biao.neibulei;

public interface Demos {
    void say();
    int[] fun();

    public static void main(String[] args) {
        int[] num={1,2,3,4,5};

        new Demos() {
            @Override
            public void say() {
                System.out.println("hello world");
            }

            @Override
            public int[] fun() {

                return num;
            }
        }.say();
    }
}
