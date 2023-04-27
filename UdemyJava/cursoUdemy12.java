package Udemy;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class cursoUdemy12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        Hotel[] hotel = new Hotel[10];

        out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();
            out.printf("\nRent #%d\n", i+1);
            out.print("Name: ");
            String name = sc.nextLine();

            out.print("Email: ");
            String email = sc.nextLine();

            out.print("Room: ");
            int room = sc.nextInt();

            hotel[room] = new Hotel(name, email, room);

        }

        out.print("\nBusy rooms:\n");

        for (int i = 0; i < hotel.length; i++) {
            if (hotel[i] != null){
                out.printf("%d: %s, %s\n", hotel[i].getRoom(), hotel[i].getName(), hotel[i].getEmail());
            }
        }
        sc.close();
    }
}
