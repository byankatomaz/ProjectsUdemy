package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemy10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){

            System.out.printf("Enter the %d number: ", i);
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        double total = sum / n;

        System.out.printf("Average height: %.2f", total);

        sc.close();

    }

}
