package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex8media_pares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contpar = 0;
        double sum = 0.0;

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0){
                sum += vect[i];
                contpar++;
            }
        }

        double avg = sum / contpar;

        if (contpar > 0){
            System.out.printf("\nAverage of even: %.1f", avg);
        }else {
            System.out.println("\nNo even number");
        }
        sc.close();
    }
}
