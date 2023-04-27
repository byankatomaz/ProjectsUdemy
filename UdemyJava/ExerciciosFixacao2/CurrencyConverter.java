package Udemy.ExerciciosFixacao2;

public class CurrencyConverter {

    public static double valueDollar;

    public static double quantityDollar;

    public static double valueTotal(){

        double mult = valueDollar * quantityDollar;

        return mult + (mult*0.06) ;
    }
}
