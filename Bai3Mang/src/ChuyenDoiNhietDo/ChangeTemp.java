package ChuyenDoiNhietDo;

import java.util.Scanner;

public class ChangeTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;
        System.out.println("Menu");
        System.out.println("1. Chuyển từ Fahrenheit sang Celsius");
        System.out.println("2. Chuyển từ Celsius sang Fahrenheit");
        System.out.println("0. Exit");
        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập độ Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("Đổi ra thành: " + celsius + " celsius");
                    break;
                case 2:
                    System.out.print("Nhập độ Celsius: ");
                    celsius = input.nextDouble();
                    fahrenheit = (9.0 / 5) * celsius + 32;
                    System.out.println("Đổi ra thành: " + fahrenheit + " fahrenheit");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
