package Triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        String color;
        System.out.println("Enter color");
        color = scanner.nextLine();

        double side1, side2, side3;
        System.out.println("Nhập 3 cạnh tam giác");
        do {
            System.out.println("Nhập side1");
            side1 = scanner.nextDouble();
            System.out.println("NHập side2");
            side2 = scanner.nextDouble();
            System.out.println("NHập side3");
            side3 = scanner.nextDouble();
            if (side1 >= side2+side3 || side2 >= side1+side3 || side3 >= side1+side2) {
                System.out.println("Tam giác không tồn tại");
                System.out.println("Nhập lại");
            }
        }while (side1 >= side2+side3 || side2 >= side1+side3 || side3 >= side1+side2);

        triangle.setColor(color);
        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        System.out.println(triangle);
    }
}
