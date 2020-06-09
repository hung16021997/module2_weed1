import java.util.Scanner;

public class BT_chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số tiền cần chuyển đổi :");
        Scanner scanner = new Scanner(System.in);
        int dola;
        int vnd;
        dola = scanner.nextInt();
        int rate = 23000;
        vnd = dola * rate;
        System.out.print("Giá trị số tiền vnd chuyển đổi được :" + vnd);
    }
}
