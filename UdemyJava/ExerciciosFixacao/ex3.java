//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
//Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo
//quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver esse problema.

package Udemy.ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter with yours grades: ");
        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.print(student.missingPoints());

    }

}
