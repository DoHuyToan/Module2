package SoNguyenToNhoHon100;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Khai báo biến input
        System.out.println("Nhập số cần tìm để in số nguyên tố");
        int numBig = input.nextInt();
        int num = 2;
        for(int i=0; i<numBig; i++){
            if(checkPrime(num)){
                System.out.print(i + " ");
            }
            num++;
        }

    }
    public static boolean checkPrime(int num){    //tạo hàm check số nguyên tố
        boolean check = true;
        for(int i =2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                check = false;
                break;
            }
        }
        return check;
    }
}
