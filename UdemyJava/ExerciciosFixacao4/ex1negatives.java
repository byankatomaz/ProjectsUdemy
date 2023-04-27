package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex1negatives {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers you will type: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();

            System.out.printf("Enter the %d number: ", i);
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMBERS NEGATIVES: ");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

}
