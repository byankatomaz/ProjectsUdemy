package Udemy.ExerciciosFixacao4;

public class DataPeople {

    private String name;
    private int age;

   public DataPeople(String name, int age){
       this.name = name;
       this.age = age;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
