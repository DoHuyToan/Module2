package HienThiLoiChao;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //khởi tạo đối tượng scanner
        System.out.println("Nhập tên vào");
        String name = scanner.nextLine();
        System.out.println("Hello" + name);
    }
}
