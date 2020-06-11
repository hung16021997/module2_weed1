package class_oop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private long startTime,endTime;
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
class testWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng:");
        int size = scanner.nextInt();
        long []array = new long[size];
        Random rdom = new Random();
        for (int i=0;i<array.length;i++) {
            array[i] = rdom.nextInt(1000);
        }
        System.out.printf("The Array made a random with %4d element value random under 1000 \n",size);
        System.out.println(Arrays.toString(array));
        StopWatch myWatch = new StopWatch();
        myWatch.start();
        for (int i=0;i<size/2;i++) {
            long temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        myWatch.stop();
        System.out.println("Total time to process soft mechanic: "+myWatch.getElapsedTime()+" ms");
    }
}
