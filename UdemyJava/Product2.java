package Udemy;

public class Product2 {

    private String name;
    private double price;

    public Product2(String name, double price){

        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
