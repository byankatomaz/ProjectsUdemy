package UdemyJava.ExerciciosFixacao6;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga quantas linhas quer que a matriz tenha: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.print("Diga quantas colunas quer que a matriz tenha: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            sc.nextLine();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\nDigite o numero da posição %d:%d : ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nDigite um numero para aparecer os valores ao seu redor: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == x){
                    System.out.printf("Posição: %d:%d\n", i, j);

                    if (j > 0){
                        System.out.printf("Valor a esquerda: %d\n", matriz[i][j-1]);
                    }

                    if (j < matriz[i].length-1){
                        System.out.printf("Valor a direita: %d\n", matriz[i][j+1]);
                    }

                    if (i > 0){
                        System.out.printf("Valor acima: %d\n", matriz[i-1][j]);
                    }

                    if (i < matriz.length-1){
                        System.out.printf("Valor abaixo: %d\n\n", matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
