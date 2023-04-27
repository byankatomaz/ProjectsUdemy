package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex6soma_vect {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum;

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Enter the numbers of vector A:");
        for (int i = 0; i < vectA.length; i++){

            sc.nextLine();
            System.out.print("Enter a number: ");

            vectA[i] = sc.nextInt();
        }

        System.out.println("\nEnter the numbers of vector B:");
        for (int i = 0; i < vectB.length; i++){

            sc.nextLine();
            System.out.print("Enter a number: ");

            vectB[i] = sc.nextInt();
        }

        System.out.println("\nResult vector: ");
        for (int i = 0; i < n; i++){
            sum = vectA[i] + vectB[i];
            System.out.println(sum);
        }

        sc.close();
    }
}
