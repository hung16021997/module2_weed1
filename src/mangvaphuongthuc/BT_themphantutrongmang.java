package mangvaphuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class BT_themphantutrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []mang = new int[10];
        mang[0] = 26;
        mang[1] = 2;
        mang[2] = 19;
        mang[3] = 95;
        for (int i=0;i<mang.length;i++) {
            System.out.print(mang[i]+"\t");
        }
        System.out.println("Nhập số cần chèn vào mảng: ");
        int input = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index<1 || index>=mang.length-1) {
            System.out.println("Không chèn được nữa");
        }
        for (int i=mang.length-1;i>index;i--) {
            mang[i] = mang[i-1];
        }
        mang[index] = input;
        System.out.println(Arrays.toString(mang));
    }
}
