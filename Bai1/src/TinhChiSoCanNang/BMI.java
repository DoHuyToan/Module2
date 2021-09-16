package TinhChiSoCanNang;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner
        double weight, height, bmi;
        System.out.println("Nhập cân nặng vào");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao vào");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);
        if(bmi<18.5){
            System.out.println("Underweight");
        } else {
            if(bmi<25){
                System.out.println("Normal");
            } else {
                if(bmi<30){
                    System.out.println("Overweight");
                } else {
                    System.out.println("Obese");
                }
            }
        }
    }
}
