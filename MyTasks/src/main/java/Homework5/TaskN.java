package Homework5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("BMV");
        car.setYear(2015);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        Motorbike motorbike = new Motorbike(2020,"Red","Opel");
        System.out.println(motorbike.color);
        System.out.println(motorbike.model);
        System.out.println(motorbike.year);
    }
}
