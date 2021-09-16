package ChuyenDoiTienTe;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int amount, a;
        double change;
        a = 23000;
        Scanner scanner = new Scanner(System.in); //khai báo biến scanner

        System.out.println("Nhập loại tiền tệ muốn đổi vào");
        String currency = scanner.nextLine();

        System.out.println("Nhập số lượng tiền muốn đổi vào");
        amount = scanner.nextInt();

        if (currency.equals("usd")) {
            change = amount * a;
            System.out.println(change);
        } else {
            if (currency.equals("vnd")) {
                change = amount / a;
                System.out.println(change);
            } else {
                System.out.println("Không hỡ trợ đổi loại tiền này");
            }
        }
    }
}
