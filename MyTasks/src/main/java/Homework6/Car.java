package Homework6;

import java.util.Scanner;

public class Car {
    int year;
    String color;
    String model;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String info(){
        return "Это автомобиль";
    }

    public int yearDifference(){
        Scanner scanner = new Scanner(System.in);
        int yearNow = scanner.nextInt();
        return yearNow - year;
    }
}
