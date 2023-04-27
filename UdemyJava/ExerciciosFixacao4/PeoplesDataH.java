package Udemy.ExerciciosFixacao4;

public class PeoplesDataH {

    private String name;
    private int age;
    private double height;

    public PeoplesDataH(String name, int age, double height){

        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
