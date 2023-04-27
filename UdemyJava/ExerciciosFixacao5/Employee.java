package Udemy.ExerciciosFixacao5;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void upSalary(double porce){
        salary += salary * porce / 100;
    }

    @Override
    public String toString() {
        return id
                + ", "
                + name
                +  ", "
                + String.format("%.2f", salary);
    }
}
