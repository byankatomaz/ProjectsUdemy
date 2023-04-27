package Udemy.ExerciciosFixacao3;

public class BankAccount {

    private int numberAccount;
    private String holderAccount;
    private double valueAccount;

    public BankAccount(int numberAccount, String holderAccount, double inicalValue){

        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        depositValue(inicalValue);
    }

    public BankAccount(int numberAccount, String holderAccount){

        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public void setHolderAccount(String holderAccount){
        this.holderAccount = holderAccount;
    }

    public String getHolderAccount(){
        return holderAccount;
    }

    public double getValueAccount(){
        return valueAccount;
    }

    public void depositValue(double deposit){
        valueAccount += deposit;
    }

    public void withdrawValue(double withdraw){
        valueAccount -= withdraw + 5.00;
    }

    public String toString(){
        return "Account: "
                + numberAccount
                + ", Holder: "
                + getHolderAccount()
                + ", Balance: $"
                + String.format("%.2f", getValueAccount());
    }
}
