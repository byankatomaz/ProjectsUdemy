package ExerciciosFixacao8;

public class Invoice {

    private double basicPayment;
    private double tax;

    public Invoice() {
    }

    public Invoice(int basicPayment, int tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(int basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicPayment() - getTax();
    }
    
}
