package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex5maiorpos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be typed: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){

            sc.nextLine();
            System.out.print("Enter a number: ");

            vect[i] = sc.nextDouble();
        }

        double maior = vect[0];
        int posi = 0;

        for (int i = 0; i < vect.length; i++){

            if (vect[i] > maior){
                maior = vect[i];
                posi = i;
            }
        }

        System.out.printf("\nHighest value: %.2f\n", maior);
        System.out.printf("The index: %d", posi);

        sc.close();
    }
}
