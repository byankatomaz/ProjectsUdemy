package Udemy;

import java.util.Scanner;

public class cursoUdemy5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, soma = 0;

        System.out.print("Digite o número de repetições: ");
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }

}