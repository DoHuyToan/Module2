package ThemPhanTu;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // khai báo biến input
        int[] array = {1,2,3,4,5,7,8,9};  // khai báo mảng array
        System.out.print("Nhập số cần chèn: ");
        int num = input.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = input.nextInt();
        addElement(array,num,index);
    }

    public static void addElement(int[] array, int num, int index){
        int [] newArray = new int[array.length+1];
        for (int i=0, j=0; j<newArray.length; i++, j++){
            if(j==index){
                newArray[j] = num;
                i--;
                continue;
            }
            newArray[j] = array[i];
        }
        for (int j=0; j< newArray.length; j++){
            System.out.print(newArray[j] + "\t");
        }
    }
}
