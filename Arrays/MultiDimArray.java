package Arrays;

import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        
        // int[][] arr = new int[3][];

        // int[][] arr2D = {
        //     {1,2,3}, //0th index
        //     {4,5}, //1st index
        //     {6,7,8,9} //2nd index -> arr2D[2] = {6,7,8,9}
        // }; 

        Scanner in = new Scanner(System.in);
        
        int[][] arr = new int[3][3];
        //System.out.println(arr.length); -> no of rows
        
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }


    }
}
