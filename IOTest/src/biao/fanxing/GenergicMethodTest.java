package biao.fanxing;

public class GenergicMethodTest {
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4};
        Character[] charArray={'H','T','L','O'};
        System.out.println("整形数组元素为：");
        printArray(intArray);
        System.out.println("\n双精度数组元素：");
        printArray(doubleArray);
        System.out.println("\n字符串数组为：");
        printArray(charArray);
    }
}
