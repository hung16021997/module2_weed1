package vonglap;

import java.util.Scanner;

public class TH_kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num < 2){
            System.out.println(num + "is not a prime");
        }else if (num == 2){
            System.out.println(num + "is a prime");
        }else {
            boolean check = false;
            int i = 2;
            while (i<= Math.sqrt(num)){
                if (num%i != 0){
                    check = true;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("is a prime");
            }
            else {
                System.out.println("is a not prime");
            }
        }
    }
}
