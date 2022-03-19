package BaiTapChuong1;

import java.util.Scanner;

/**
 * Create an array contains integers >= 10
 * Write a method that lists pairs of elements with the closest values
 */
public class BaiTap2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array length");
        int length = in.nextInt();
        System.out.println("Enter the values for the array, (value >= 10)");
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = in.nextInt();
        }
        listOfValue(arr);

    }
    public static void listOfValue(int[] arr){
        for(int firstNum = 0; firstNum < arr.length-1; firstNum++){
            int gap = Math.abs(arr[firstNum] - arr[firstNum+1]);
            int pairNum = arr[firstNum+1];
            for(int secondNum = firstNum+1; secondNum < arr.length; secondNum++){
                if(Math.abs(arr[firstNum] - arr[secondNum]) < gap){
                    gap = Math.abs(arr[firstNum] - arr[secondNum]);
                    pairNum = arr[secondNum];
                }
            }
            System.out.print(firstNum + " " + pairNum + " , ");
        }
    }
}
