package Homework6;

import java.util.Scanner;

public class Motorbike {
    int year;
    String color;
    String model;

    Motorbike(int year,String color,String model){
        this.color = color;
        this.model = model;
        this.year = year;
    }
    public String info(){
        return "Это мотоцикл";
    }

    public int yearDifference(){
        Scanner scanner = new Scanner(System.in);
        int yearNow = scanner.nextInt();
        return yearNow - year;
    }
}
