package vonglap;

import java.util.Scanner;

public class BT_hienthi20songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("nhập số luộng số nguyên tố cần in ra :");
        num = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count<num) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        if( n == 2)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } return true;
    }
}
