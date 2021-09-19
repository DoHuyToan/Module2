package XoaPhanTuTrongMang;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //khai bao bien input
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập số cần xóa");
        int num = input.nextInt();
        checkNum(array, num);
        if (checkNum(array, num) == -1) {
            System.out.println("Không tìm thấy trong mảng");
        } else {
            array = deleteNum(array, num);
            for(int i =0; i< array.length; i++){
                System.out.print(array[i] + "\t");
            }
        }
    }

    // tìm xem num có trong mảng ko
    public static int checkNum(int[] array, int num){
        int index = -1;
        for (int i=0; i< array.length; i++){
            if(num == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] deleteNum(int[] array, int num){
        for(int i = checkNum(array,num); i< array.length; i++){
            if(i< array.length-1){
                array[i]=array[i+1];
            } else {
                array[i]=0;
            }
        }
        return array;
    }
}
