package Phan2;

import java.util.Scanner;

public class NgayThangNam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tiepTuc;

        int soNgay;
        do {
            System.out.print("Nhập tháng (1-12): ");
            int thang = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập năm: ");
            int nam = sc.nextInt();
            sc.nextLine();
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    soNgay = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    soNgay = 30;
                    break;
                case 2:
                    if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                        soNgay = 29;
                    } else {
                        soNgay = 28;
                    }
                    break;
                default:
                    System.out.println("Tháng không hợp lệ!");
                    sc.nextLine();
                    return;
            }
            System.out.println("Tháng " + thang + "/" + nam + " có " + soNgay + " ngày.");
            System.out.print("Bạn có muốn tiếp tục? (y/n): ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("y"));
    }
}
