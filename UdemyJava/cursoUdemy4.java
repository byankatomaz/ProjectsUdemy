package Udemy;

import java.util.Scanner;

public class cursoUdemy4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, soma;

        soma = 0;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        while (x != 0){
            soma += x;
            System.out.println("Digite um número: ");
            x = sc.nextInt();

        }

        System.out.printf("Os valores somados dão: %d", soma);

        sc.close();
    }

}
