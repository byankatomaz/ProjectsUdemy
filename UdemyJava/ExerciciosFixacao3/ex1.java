package Udemy.ExerciciosFixacao3;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holderAccount = sc.nextLine();

        BankAccount bank = new BankAccount(numberAccount, holderAccount);

        System.out.println();
        System.out.print("Is initial deposit value (y/n): ");
        char deci = sc.next().charAt(0);

        if (deci == 'y') {

            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            bank.depositValue(deposit);

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.print(bank);

        System.out.println("\n");
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.depositValue(deposit);

        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdrawValue(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(bank);

        sc.close();
    }
}
