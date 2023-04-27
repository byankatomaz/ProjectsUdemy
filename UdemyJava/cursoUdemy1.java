package Udemy;

import java.util.Locale;

public class cursoUdemy1 {
    public static void main(String[] args) {

        int age, code;
        char gender;
        String product1, product2;
        double price1, price2, measure;

        age = 30;
        code = 5290;
        gender = 'F';

        product1 = "Computer";
        product2 = "Office desk";

        price1 = 2100.0;
        price2 = 650.50;
        measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f \n", product1, price1);
        System.out.printf("%s, which price is $ %.2f \n\n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);



    }
}
