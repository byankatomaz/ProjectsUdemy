package Udemy;

import java.util.Scanner;

public class cursoUdemy13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");;
        }

        System.out.println();

        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.printf("Negative numbers: %d", cont);

        sc.close();
    }

}
