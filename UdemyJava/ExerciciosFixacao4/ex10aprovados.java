package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex10aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will each vector have? ");
        int n = sc.nextInt();

        Aprove[] vect = new Aprove[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Data the %da student: \n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("First grice: ");
            double firstGrice = sc.nextDouble();

            System.out.print("Second grice: ");
            double secondGrice = sc.nextDouble();

            vect[i] = new Aprove(name, firstGrice, secondGrice);
        }

        System.out.println("\nStudents aprove: ");
        double avg = 0.0;

        for (int i = 0; i < vect.length; i++){
            avg = vect[i].averangeHeight();

            if (avg >= 6.0){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
