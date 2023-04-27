package Udemy.ExerciciosFixacao4;

public class Aprove {

    private String name;
    private double firstGrice;
    private double secondGrice;

    public Aprove(String name, double firstGrice, double secondGrice){
        this.name = name;
        this.firstGrice = firstGrice;
        this.secondGrice = secondGrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstGrice(double firstGrice) {
        this.firstGrice = firstGrice;
    }

    public double getFirstGrice() {
        return firstGrice;
    }

    public void setSecondGrice(double secondGrice) {
        this.secondGrice = secondGrice;
    }

    public double getSecondGrice() {
        return secondGrice;
    }

    public double averangeHeight(){
        return  (firstGrice + secondGrice) / 2;
    }
}
