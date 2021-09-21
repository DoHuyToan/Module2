package PhuongTrinhBacHai;

import java.util.Scanner;

public class MainQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Khai báo đối tượng input
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);     //khai báo đối tượng quadraticEquation

        if(a==0){
            System.out.print("Phương trình có nghiệm là x= " + quadraticEquation.getRoot0());
        } else {
            if(quadraticEquation.getDiscriminant()==0){
                System.out.print("Phương trình có nghiệm kép là x1 = x2 = " + quadraticEquation.getRoot());
            } else {
                if(quadraticEquation.getDiscriminant()<0){
                    System.out.print("Phương trình vô nghiệm");
                } else {
                    System.out.print("Phương trình có 2 nghiệm là x1= " + quadraticEquation.getRoot1());
                    System.out.print(" và x2= " + quadraticEquation.getRoot2());
                }
            }
        }
    }
}
