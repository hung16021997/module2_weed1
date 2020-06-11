package class_oop.phuongtrinhbac2;

import java.util.Scanner;

public class phuongtrinhbac22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b :");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        phuongtrinhbac2 ptb2 = new phuongtrinhbac2();
        System.out.println(ptb2.checkRoot());
        if (ptb2.checkRoot().equals("the equation has a root")){
            System.out.println("Root : " + ptb2.getRoot1());
        }
        else if (ptb2.checkRoot().equals("the equation has a roots")){
            System.out.println("Root1: "+ptb2.getRoot1()+" and "+"Root2: "+ptb2.getRoot2());
        }
    }
}
