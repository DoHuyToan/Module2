package SoNguyenTo;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //khai báo biến scanner
        System.out.println("Điền số cần kiểm tra số nguyên tố vào");
        int num = scanner.nextInt();
        boolean check = true;

        if(num<2){
            check = false;
        } else {
            int i =2;
            while (i<=Math.sqrt(num)){
                if(num % i == 0){
                    check = false;
                    break;
                } i++;
            }
        }
        if(check)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " not is prime");
    }
}
