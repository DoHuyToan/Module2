package GopMang;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9};

        System.out.print("Mảng arr1: ");
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + "\t");
        } System.out.println();

        System.out.println("Mảng arr2: ");
        for (int i=0; i< arr2.length; i++){
            System.out.print(arr2[i] + "\t");
        } System.out.println();

        System.out.println("Mảng newArr = arr1 + arr2 ");
        cocatArray(arr1,arr2);
    }

    public static void cocatArray(int arr1[], int arr2[]){
        int newArr[] = new int [arr1.length + arr2.length];
        for (int i=0; i<arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for (int i=0; i<arr2.length; i++){
            newArr[arr1.length +i ] = arr2[i];
        }
        for (int i=0; i<(arr1.length+arr2.length); i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}

