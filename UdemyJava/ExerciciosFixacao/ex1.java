//Fazer um programa para ler os valores da largura e altura de um retângulo.
//Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
//Usar uma classe como mostrado no projeto ao lado.

package Udemy.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle data: ");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

        sc.close();
    }

}
