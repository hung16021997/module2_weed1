package com.company;

import java.util.Scanner;

public class docSothanhChu {
    public static void main(String[] args) {
        int x;
        int hunds;
        int tens;
        int units;
        String docKetqua = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of Integer that is not over 3 units and higher than Zero:");
        x = scanner.nextInt();
        if (x <= 20) {
            switch (x) {
                case 1: {
                    System.out.println("Một");
                    break;
                }
                case 2: {
                    System.out.println("Hai");
                    break;
                }
                case 3: {
                    System.out.println("Ba");
                    break;
                }
                case 4: {
                    System.out.println("Bốn");
                    break;
                }
                case 5: {
                    System.out.println("Năm");
                    break;
                }
                case 6: {
                    System.out.println("Sáu");
                    break;
                }
                case 7: {
                    System.out.println("Bảy");
                    break;
                }
                case 8: {
                    System.out.println("Tám");
                    break;
                }
                case 9: {
                    System.out.println("Chín");
                    break;
                }
            }
        } else if(x <= 999) {
            units = x % 10;
            tens = (x/10)%10;
            hunds = x/100;
            switch (hunds) {
                case 0: {
                    docKetqua = "";
                    break;
                }
                case 1: {
                    docKetqua = "Một trăm";
                    break;
                }
                case 2: {
                    docKetqua = "Hai trăm";
                    break;
                }
                case 3: {
                    docKetqua = "Ba trăm";
                    break;
                }
                case 4: {
                    docKetqua = "Bốn trăm";
                    break;
                }
                case 5: {
                    docKetqua = "Năm trăm";
                    break;
                }
                case 6: {
                    docKetqua = "Sáu trăm";
                    break;
                }
                case 7: {
                    docKetqua = "Bảy trăm";
                    break;
                }
                case 8: {
                    docKetqua = "Tám trăm";
                    break;
                }
                case 9: {
                    docKetqua = "Chín trăm";
                    break;
                }
            }
            if (tens == 0) {
                docKetqua += " linh ";
            } else {
                switch (tens) {
                    case 1: {
                        docKetqua += " mười ";
                        break;
                    }
                    case 2: {
                        docKetqua += " hai mươi ";
                        break;
                    }
                    case 3: {
                        docKetqua += " ba mươi ";
                        break;
                    }
                    case 4: {
                        docKetqua += " bốn mươi ";
                        break;
                    }
                    case 5: {
                        docKetqua += " năm mươi ";
                        break;
                    }
                    case 6: {
                        docKetqua += " sáu mươi ";
                        break;
                    }
                    case 7: {
                        docKetqua += " bảy mươi ";
                        break;
                    }
                    case 8: {
                        docKetqua += " tám mươi ";
                        break;
                    }
                    case 9: {
                        docKetqua += " chín mươi ";
                        break;
                    }
                }
                switch (units) {
                    case 1: {
                        docKetqua += "mốt";
                        break;
                    }
                    case 2: {
                        docKetqua += "hai";
                        break;
                    }
                    case 3: {
                        docKetqua += "ba";
                        break;
                    }
                    case 4: {
                        docKetqua += "bốn";
                        break;
                    }
                    case 5: {
                        docKetqua += "năm";
                        break;
                    }
                    case 6: {
                        docKetqua += "sáu";
                        break;
                    }
                    case 7: {
                        docKetqua += "bảy";
                        break;
                    }
                    case 8: {
                        docKetqua += "tám";
                        break;
                    }
                    case 9: {
                        docKetqua += "chín";
                        break;
                    }
                }
            }
            System.out.println(docKetqua);
        } else {
            System.out.println("Không đọc nổi");
        }
    }
}