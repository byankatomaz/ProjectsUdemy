package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex2sum_vect {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers you will type: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){

            System.out.print("Enter with a number: ");
            vect[i] = sc.nextDouble();

        }

        double sum = 0;

        System.out.println();
        System.out.print("Values: ");

        for (int i = 0; i < vect.length; i++){

            sum += vect[i];
            System.out.printf("%.1f ", vect[i]);

        }

        double average = sum / vect.length;

        System.out.println();
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Average height: %.2f", average);

        sc.close();
    }

}
