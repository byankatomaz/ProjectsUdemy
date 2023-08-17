package DesafioVect;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemyDesafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PeopleData[] people = new PeopleData[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            sc.nextLine();
            System.out.printf("\nRent #%d\n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            people[room] = new PeopleData(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null){
                System.out.printf("%d: %s\n", i, people[i]);
            }
        }

        sc.close();
    }
}
