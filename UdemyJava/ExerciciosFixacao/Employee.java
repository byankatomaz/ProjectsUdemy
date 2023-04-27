package Udemy.ExerciciosFixacao;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public void increaseSalary(double percentage){
        grossSalary += grossSalary*(percentage/100);
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", netSalary());
    }

}
