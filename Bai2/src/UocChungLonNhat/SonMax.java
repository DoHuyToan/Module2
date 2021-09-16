package UocChungLonNhat;

import java.util.Scanner;

public class SonMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //khai báo biến sc

        System.out.println("Nhập số thứ nhất");
        int a = sc.nextInt();

        System.out.println("Nhập số thứ hai");
        int b = sc.nextInt();


        if(a==0 && b==0){
            System.out.println("Không có ước chung lớn nhất");
        }

        if(a==0 && b!=0){
            System.out.println("Ước chung lớn nhất là " + b);
        }

        if(a!=0 && b==0){
            System.out.println("Ước chung lớn nhất là " + a);
        }

        if(a!=0 && b!=0 ){
            int max = 1;
            for(int i=1; i<=a || i<=b; i++){
                if(a%i==0 && b%i==0){
                    max = i;
                }
            }
            System.out.println("Ước lớn nhất của " + a + " và " + b + " là " + max);
        }
    }
}


//        a = Math.abs(a); //trả về giá trị tuyệt đối |a|
//        b = Math.abs(b); //trả về giá trị tuyệt đối |b|
//
//        if(a == 0 || b == 0)
//            System.out.println("Không có ước chung lớn nhất");
//        while (a !=  b){
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//        System.out.println("Ước chung lớn nhất là " + a);
//    }
//}
