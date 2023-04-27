package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemy11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list of products: ");
        int n = sc.nextInt();

        Product2[] vect = new Product2[n];

        for (int i = 0; i < vect.length; i++){

            sc.nextLine();
            System.out.print("Enter the name of product: ");
            String name = sc.nextLine();
            System.out.print("Enter the price: ");
            double price = sc.nextDouble();

            vect[i] = new Product2(name, price);

        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double total = sum / vect.length;

        System.out.println();
        System.out.printf("Average price: %.2f", total);

        sc.close();

    }

}
