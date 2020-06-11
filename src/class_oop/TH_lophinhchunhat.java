package class_oop;

import java.util.Scanner;

public class TH_lophinhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        LopHinhChuNhat hcn1 = new LopHinhChuNhat(width,height);
        System.out.println("Hình chữ nhật bạn nhập \n"+hcn1.display());
        System.out.println("Chu vi của hình chữ nhật: "+hcn1.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật: "+hcn1.getArea());
    }
}
class LopHinhChuNhat {
    double width,height;
    public LopHinhChuNhat() {
    }
    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "Hình chữ nhật{"+"width="+width+", height=" +height+"}";
    }
}
