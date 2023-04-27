package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex3heights {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed: ");
        int n = sc.nextInt();

        PeoplesDataH[] vect = new PeoplesDataH[n];

        for (int i = 0; i < vect.length; i++){

            sc.nextLine();
            System.out.printf("Data the %da people: \n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            vect[i] = new PeoplesDataH(name, age, height);
        }

        double sum = 0;
        double menorage = 0;

        System.out.println();

        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getHeight();

            if (vect[i].getAge() < 16){
                menorage++;
            }
        }

        double avg = sum / vect.length;

        System.out.printf("Average height: %.2f", avg);

        double avfAge = (menorage / vect.length) * 100;
        System.out.println();

        System.out.printf("People under 16 years old: %.2f%%", avfAge);
        System.out.println();

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
