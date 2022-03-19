package BaiTapChuong1;

import java.util.Scanner;

/**
 * Create an integer array
 * Write a method lists the 3^k values in the array
 * If there is no matching value, return 0
 */

public class BaiTap1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array length");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the values of the array");
        for(int i = 0; i < length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("The values that are power of three are:\t");
        list(arr);
    }
    public static void list(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPowerOf3(arr[i])){
                System.out.print(arr[i] + "\t");
                result++;
            }
        }
        if(result == 0){
            System.out.println(0);
        }


    }
    public static boolean isPowerOf3(int i){
        while(i > 3){
            if(i % 3 != 0){
                return false;
            }
            else{
                i = i/3;
            }
        }
        if(i == 3){
            return true;
        }
        return false;
    }
}
