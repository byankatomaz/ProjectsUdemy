package Udemy.ExerciciosFixacao4;

public class HeightData {

    private double height;
    private char gender;

    public HeightData(char gender, double height){
        this.gender = gender;
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double womanHeight(double sum, int wmnumber){
        return sum / wmnumber;
    }
}
