package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class cursoUdemy6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, px, ax, py, ay;

        System.out.println("Digite o valor dos lados do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite o valor dos lados do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        px = (xA + xB + xC) / 2.0;
        ax = Math.sqrt(px*(px - xA)*(px - xB)*(px - xC));

        py = (yA + yB + yC) / 2.0;
        ay = Math.sqrt(py*(py - yA)*(px - yB)*(py - yC));

        System.out.printf("O perimetro do triângulo X é: %.2f e sua área é: %.2f", px, ax);
        System.out.println();
        System.out.printf("O perimetro do triângulo Y é: %.2f e sua área é: %.2f", py, ay);
        System.out.println();

        if(ax > ay){
            System.out.println("A maior área é: X");
        } else{
            System.out.println("A maior área é: Y");
        }

        sc.close();
    }
}
