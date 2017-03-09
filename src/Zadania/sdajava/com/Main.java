package Zadania.sdajava.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h;
        System.out.println("Podaj wysoko��: ");
        Scanner odczytH = new Scanner(System.in);
        h = odczytH.nextInt();
        int g = 2 * h - 2;

        int[][] matrix = new int[2 * h][2 * h];
        for (int j = 0; j <= h; j++) {
            for (int k = 0; k <= h; k++) {
                if ((k == 0) || (k == j)) {
                    matrix[k][j] = 1;
                    System.out.print(matrix[k][j] + " ");
                    // }
                    // if ((k > j+1)) {
                    //      matrix[k][j] = 0;
                    //       System.out.print(matrix[k][j] + " ");
                }

                if ((k != 0) && (k < j)) {
                    matrix[k][j] = matrix[k-1][j-1] + matrix[k][j-1];
                    System.out.print(matrix[k][j] + " ");
                }
                if (k > j) {
                    matrix[k][j] = 0;
                    System.out.print(matrix[k][j] + " ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");


        for (int j = 0; j <=h-1; j++) {
            for (int l =  h - j-1; l >= 0; l--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {

                if(matrix[k][j] < 10){
                    System.out.print(" ");
                }

                System.out.print(matrix[k][j] + " ");
            }
            System.out.println("");
        }
    }
}
