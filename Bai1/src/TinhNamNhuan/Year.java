package TinhNamNhuan;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner
        System.out.println("Nhập năm vào");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

//        if(year %4 == 0){
//            if(year %100 == 0){
//                if(year %400 == 0){
//                    System.out.println("Đây là năm nhuận");
//                }
//                else {
//                    System.out.println("Đây không phải là năm nhuận");
//                }
//            } else {
//                System.out.println("Đây là năm nhuận");
//            }
//        } else {
//            System.out.println("Đây không phải là năm nhuận");
//        }