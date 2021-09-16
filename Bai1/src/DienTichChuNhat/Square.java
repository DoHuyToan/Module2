package DienTichChuNhat;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat(); //nhập chiều rộng

        System.out.println("Nhập chiều dài: ");
        height = scanner.nextFloat(); //nhập chiều dài

        float are = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + are);
    }
}
