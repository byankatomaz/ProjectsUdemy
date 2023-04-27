package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex7abaixo_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("\nAverage of vector: %.3f\n", avg);
        System.out.println("Below-average elements: ");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] < avg){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
