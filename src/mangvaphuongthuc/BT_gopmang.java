package mangvaphuongthuc;

import java.util.Scanner;

public class BT_gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []mang1 = new int[5];
        int []mang2 = new int[3];
        System.out.println("Nhập phần tử mảng 1: ");
        for (int i=0;i<mang1.length;i++) {
            mang1[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2: ");
        for (int j=0;j<mang2.length;j++) {
            mang2[j] = scanner.nextInt();
        }
        System.out.println("/==================/");
        int []mang3 = new int[mang1.length+mang2.length];
        for (int i=0;i<mang1.length;i++) {
            mang3[i] = mang1[i];
            System.out.println(mang3[i]);
        }
        for (int j=0;j<mang2.length;j++) {
            mang3[mang1.length+j] = mang2[j];
            System.out.println(mang3[mang1.length+j]);
        }
    }
}
