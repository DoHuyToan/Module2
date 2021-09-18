package TimGiaTriNhoNhat;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // khai báo biến input
        int size;
        int [] array;

        // nhập size
        do{
            System.out.println("Nhập sai vào");
            size = input.nextInt();
            if(size>20)
                System.out.println("size quá to, nhập lại");
        } while (size>20);

        // nhập các phần tử
        array = new int[size];
        for (int i =0; i< array.length; i++){
            System.out.print("Phẩn tử thứ " + i + " : ");
            array[i] = input.nextInt();
        }

        // hiển thị mảng
        System.out.print("Các phần tử trong mảng là:  ");
        for (int j=0; j< array.length; j++){
            System.out.print(array[j] + "\t");
        } System.out.println();

        // tìm min
        int min = array[0];
        for (int i=0; i< array.length; i++){
            if(array[i]<min)
                min = array[i];
        } System.out.println("Phần tử nhỏ nhất là: " + min);
    }
}
