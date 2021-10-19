package Homework6;

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

        Airplane airplane = new Airplane("London", 2012,35,4);
        airplane.setYear(2021);
        airplane.setLength(65);
        airplane.fillUp();
        airplane.fillUp();
        System.out.println(airplane.info());

        Student student = new Student("Олег");

        Teacher teacher = new Teacher("Ольга","Математика");
        System.out.println(teacher.evaluate(student));
    }
}
