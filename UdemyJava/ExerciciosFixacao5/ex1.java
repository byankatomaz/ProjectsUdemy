package Udemy.ExerciciosFixacao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            sc.nextLine();
            System.out.printf("\nEmployee #%d\n", i+1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (hasId(employee, id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            employee.add(emp);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        Employee pos = employee.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);


        //metodo para achar a pessoa com uma classe auxiliar:
        //Integer pos = position(employee, idsalary);

        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double porce = sc.nextDouble();

            pos.upSalary(porce);
        }

        System.out.println("\nList of employees:");

        for (Employee emplo : employee) {
            System.out.println(emplo);
        }
        sc.close();
    }



    static Integer position(List<Employee> emploAux, int idsalary){
        for (int i = 0; i < emploAux.size(); i++) {
            if (emploAux.get(i).getId() == idsalary){
                return i;
            }
        } return null;
    }

    static boolean hasId(List<Employee> employee, int idsalary){
        Employee pos = employee.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        return pos != null;
    }
}
