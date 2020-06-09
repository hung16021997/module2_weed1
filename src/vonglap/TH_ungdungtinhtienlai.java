package vonglap;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class TH_ungdungtinhtienlai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("nhập số tháng cho vay :");
        int month = scanner.nextInt();
        System.out.println("nhập tỉ lệ lãi suất cho vay :");
        float rate = scanner.nextFloat();
        double tienlai = money * rate / 100 / 12 * month;
        System.out.println("Tổng số tiền thu cả gốc lẫn lãi là: "+(money+tienlai));
    }
}
