package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemy7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite o valor dos lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor dos lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double ax = x.area();
        double ay = y.area();

        System.out.printf("A área do triângulo X é: %.2f", ax);
        System.out.println();
        System.out.printf("A área do triângulo Y é: %.2f", ay);
        System.out.println();

        if(ax > ay){
            System.out.println("A maior área é: X");
        } else{
            System.out.println("A maior área é: Y");
        }

        sc.close();
    }
}