package biao;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class TimeTest {
    public static void main(String[] args) {
    LocalDateTime time=LocalDateTime.now();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(formatter.format(time));
        StringBuffer buffer=new StringBuffer("hello world");
        System.out.println(buffer.capacity());
        int a=20;
        String s=String.format("%d",a);
        System.out.println(s);
        int[] num=new int[10];
        Arrays.fill(num,6);
        System.out.println(num[2]);

    }
}
