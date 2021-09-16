package DocSoThanhChu;

import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner
        int num, hundred, unit, dozen;
        System.out.println("Nhập số cần đọc vào");
        num = scanner.nextInt();
        hundred = (num-(num%100))/100; //tìm số hàng trăm
        unit = num%10;                 //tìm số hàng đơn vị
        dozen = (num%100 - num%10)/10; //tìm số hàng chục

        switch (hundred) {             //in số hàng trăm
            case 1:
                System.out.print("one hundred and ");
                break;
            case 2:
                System.out.print("two hundred and ");
                break;
            case 3:
                System.out.print("three hundred and ");
                break;
            case 4:
                System.out.print("four hundred and ");
                break;
            case 5:
                System.out.print("five hundred and ");
                break;
            case 6:
                System.out.print("six hundred and ");
                break;
            case 7:
                System.out.print("seven hundred and ");
                break;
            case 8:
                System.out.print("eight hundred and");
                break;
            case 9:
                System.out.print("nine hundred and ");
                break;
            default:
                System.out.println("");
        }

        if(dozen == 1){          //in số hàng chục
                switch (unit){
                    case 0:
                        System.out.print("ten");
                        break;
                    case 1:
                        System.out.print("elevent");
                        break;
                    case 2:
                        System.out.print("twelve");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("forteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("nineteen");
                        break;
                }
        } else {
            switch (dozen){           //in số hàng đơn vị
                case 0:
                    System.out.print("");
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
            }

            switch(unit){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
    }
}
