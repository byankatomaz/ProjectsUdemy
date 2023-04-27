package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex9mais_velho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        DataPeople[] vect = new DataPeople[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Data the %da people: \n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            vect[i] = new DataPeople(name, age);
        }

        int oldage = vect[0].getAge();
        String nameold = "";

        for (int i = 0; i < vect.length; i++){

            if (vect[i].getAge() > oldage){
                oldage = vect[i].getAge();
                nameold = vect[i].getName();
            }
        }

        System.out.printf("\nOlder person: %s", nameold);

        sc.close();
    }
}