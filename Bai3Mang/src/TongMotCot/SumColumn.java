package TongMotCot;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int arrTwo[][] = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7}
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cột muốn tính tổng vào: ");
        int index = input.nextInt();
        int sum = 0;
        for (int i=0; i< arrTwo.length; i++){
            sum += arrTwo[i][index];
        }
        System.out.print("Tổng cột " +index+ " : " +sum);
    }
}
