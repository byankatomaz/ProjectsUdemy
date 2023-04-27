package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi, raio, area;
        pi = 3.14159;

        Locale.setDefault(Locale.US);
        raio = sc.nextDouble();

        area = pi*(Math.pow(raio, 2));

        System.out.printf("\nA area do circulo é: %f", area);




    }
}
