package TinhLaiSuat;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //khai báo biến sc

        System.out.println("Nhập lượng tiền vay ban đầu");
        int money = sc.nextInt();

        System.out.println("Nhập lãi suất theo năm");
        double interes = sc.nextDouble();

        System.out.println("Nhập số tháng đã vay");
        int month = sc.nextInt();

        double interesRate = 0;
        for (int i = 0; i<month; i++){
            interesRate += money * (((interes/100)/12)*month);
        }
        System.out.println("Tiền lãi phải trả là " + interesRate);
    }
}
