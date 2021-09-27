package DemSoLanTrongChuoi;

import java.util.Scanner;

public class CountFind {
    public static void main(String[] args) {
        String arr = "vdsfvbfbgbxzvvsav";
        Scanner scanner = new Scanner(System.in);

        //do trên là kiểu String nên ở đây ta phải đổi sang kiểu ký tự char
        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (character == arr.charAt(i)){
                count++;
            }
        }
        System.out.print("Ký tự " +character+ " xuất hiện " +count+ " lần");

//        int a = countByCharacter("NAMKHANH", 'A');
//        System.out.println(a);
    }
//    public static int countByCharacter(String text, char character){
//        int count=0;
//        for (int i = 0; i < text.length(); i++) {
//            char a = text.charAt(i);
//            if (a ==character) count++;
//        }
//        return count;
//    }
}


