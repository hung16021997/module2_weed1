package buoi1;

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

    public static class BT_ungdungdocsothanhchu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input a number (0 - 999)");
            int number = scanner.nextInt();
            int onesDigit = 0;
            int tensDigit;
            int hundredsDigit;
            String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
             "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"};
            String[] tens = {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
            hundredsDigit = number / 100 - 1;
            hundredsDigit = number / 100 - 1;
            tensDigit = (number % 100) / 10 - 1;
            if (number % 100 < 20) {
                onesDigit = number % 20;
            }
            if (number < 20) {
                String result = ones[number];
                System.out.println("Result: " + result);
            } else if (number > 20 && number < 100) {
                System.out.println("Result: " + tens[tensDigit] + " " + ones[onesDigit]);
            } else if (number % 100 == 0) {
                System.out.println("Result: " + hundreds[hundredsDigit]);
            } else if (number > 100 && number < 1000) {
                System.out.println("Result: " + hundreds[hundredsDigit] + " " + tens[tensDigit] + " " + ones[onesDigit]);
            } else {
                System.out.println("Out of ability!");
            }
        }
    }
}
