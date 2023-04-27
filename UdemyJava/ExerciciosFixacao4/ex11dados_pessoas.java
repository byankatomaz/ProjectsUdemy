package Udemy.ExerciciosFixacao4;

import java.util.Locale;
import java.util.Scanner;

public class ex11dados_pessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will each vector have? ");
        int n = sc.nextInt();

        HeightData[] vect = new HeightData[n];

        for (int i = 0; i < vect.length; i++){

            System.out.printf("Data the %da people: \n", i+1);
            System.out.print("Height: ");
            double height = sc.nextDouble();

            System.out.print("Gender: ");
            char gender = sc.next().toUpperCase().charAt(0);

            vect[i] = new HeightData(gender, height);
        }

        double lower = vect[0].getHeight();
        double highest = vect[0].getHeight();

        for (int i = 0; i < vect.length; i++){

            if (vect[i].getHeight() > highest){
                highest = vect[i].getHeight();

            } else if (vect[i].getHeight() < lower){
                lower = vect[i].getHeight();
            }
        }

        System.out.printf("\nShorter height: %.2f", lower);
        System.out.printf("\nGreater height: %.2f\n", highest);

        int nummen = 0;
        int wmnumber = 0;
        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getGender() == 'F'){
                sum += vect[i].getHeight();
                wmnumber++;
                avg = vect[i].womanHeight(sum, wmnumber);
            } else if (vect[i].getGender() == 'M') {
                nummen++;
            }
        }

        System.out.printf("\nAverage height of women: %.2f\n", avg);
        System.out.printf("Number of men: %d", nummen);

        sc.close();
    }
}
