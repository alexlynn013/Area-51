package Oop.Test;

public class Car {

    String modelName;
    int year;

    void insert(String mn, int y){
        modelName = mn;
        year = y;

    }
    void insert2(String modelName, int year){
        this.modelName = modelName;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car = new Car();
       car.insert("Toyota",2020);
        car.insert2("Honda", 2002);

        System.out.println(car.modelName + " " +car.year);
        System.out.println(car.modelName + " " +car.year);



    }

}
