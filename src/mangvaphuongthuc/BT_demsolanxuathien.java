package mangvaphuongthuc;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BT_demsolanxuathien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = "Toi dang hoc ngon ngu lap trinh Java";
        System.out.println("Nhap ky tu muon kiem tra");
        char a = scanner.next().charAt(0);
        int count =0;
        for (int i=0;i<x.length();i++) {
            if (x.charAt(i)==a) {
                count++;
            }
        }
        if (count ==0) {
            System.out.printf("Ky tu %s khong co trong chuoi",a);
        } else {
            System.out.printf("Ky tu %s xuat hien trong chuoi %d lan",a,count);
        }
    }
}