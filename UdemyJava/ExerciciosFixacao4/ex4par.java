package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex4par {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be typed: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){

            sc.nextLine();
            System.out.print("Enter a number: ");

            vect[i] = sc.nextInt();
        }

        int quantity = 0;

        System.out.println("\nEven numbers: ");

        for (int i = 0; i < vect.length; i++){

            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                quantity++;
            }
        }

        System.out.printf("\n\nQuantity of even numbers: %d", quantity);

        sc.close();
    }
}
