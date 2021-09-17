package HienThiCacLoaiHinh;

import java.util.Scanner;

public class ShowForm {
    public static void main(String[] args) {
        Scanner ipnut = new Scanner(System.in); //khai báo biến input
        System.out.println("Show form");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Nhập hình muốn show");
        int num = -1;

        while (num!=0){
            num = ipnut.nextInt();
            switch (num){
                case 1:
                    for(int i=0; i<3 ; i++){
                        for(int j=0; j<6; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i=0; i<5 ; i++){
                        for(int j=0; j<=i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i=0; i<5; i++){
                        for (int j=0; j<5-i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có trong form");
            }
        }
    }
}
