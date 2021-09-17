package HaiMuoiSoNguyenToDauTien;

import java.util.Scanner;

public class NumPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // khai báo biến input
        System.out.println("Nhập số lượng số nguyên tố cần tìm");
        int amount = input.nextInt();
        int num =2;
        for (int count = 0; count < amount;) {
                if (checkPrime(num)) {
                    count++;
                    System.out.print(num + " ");
                }
                num++;
            }
    }

    public static boolean checkPrime(int num) {
        boolean flag = true;
        for(int i = 2;i<= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
        }
    }


