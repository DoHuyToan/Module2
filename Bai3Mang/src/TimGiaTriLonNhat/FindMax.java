package TimGiaTriLonNhat;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner input = new Scanner(System.in); //khai báo biến input

        do {    //nhập size
            System.out.print("Nhập size vào: ");
            size = input.nextInt();
            if(size>20)
                System.out.println("size quá to, nhập lại");
        } while (size>20);

        array = new int[size];      //nhập các phần tử trong mảng
        int i=0;
        while (i < array.length){
            System.out.print("Nhập phần tử " + (i+1) + ": ");
            array[i] = input.nextInt();
            i++;
        }

        //hiển thị các phần tử trong mảng
        System.out.print("Danh sách các phần tử trong mảng:  ");
        for(int j=0; j< array.length; j++){
            System.out.print(array[j] + "\t");
        } System.out.println();

        //tìm phần tử max
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử lớn nhất là " + max + " tại vị trí " + index);



    }
}
