package DemSoLanTrongChuoi;

import java.util.Scanner;

public class CountFind {
    public static void main(String[] args) {
        String arr = "vdsfvbfbgbxzvvsav";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        char str = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (str == arr.charAt(i)){
                count++;
            }
        }
        System.out.print("Ký tự " +str+ " xuất hiện " +count+ " lần");
    }
}
